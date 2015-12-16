package com.swandiggy.poe4j.data;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.io.Files;
import com.swandiggy.poe4j.Poe4jException;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.readers.field.FieldReader;
import com.swandiggy.poe4j.data.rows.AbstractRow;
import com.swandiggy.poe4j.util.io.BinaryReader;
import com.swandiggy.poe4j.util.io.MappedBinaryReader;
import lombok.extern.slf4j.Slf4j;
import org.reflections.Reflections;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Read records from a .dat file.
 *
 * @author Jacob Swanson
 * @since 9/5/2015
 */
@Slf4j
public class DatFileReader<T extends AbstractRow> implements Closeable {

    /**
     * Map of .dat file names to rows classes
     */
    public static final BiMap<String, Class<?>> entityClasses = HashBiMap.create();

    /**
     * Collect all classes with @DatFile
     */
    static {
        Reflections reflections = new Reflections();
        for (Class<?> clazz : reflections.getTypesAnnotatedWith(DatFile.class)) {
            DatFile datFile = clazz.getAnnotation(DatFile.class);
            if (StringUtils.isEmpty(datFile.value())) {
                entityClasses.put(clazz.getSimpleName(), clazz);
            } else {
                entityClasses.put(datFile.value(), clazz);
            }
        }
    }

    /*
     * Weak cache of records
     */
    private static final Cache<String, AbstractRow> recordCache = CacheBuilder.newBuilder().softValues().build();

    private File file; // .dat file
    private BinaryReader br; // reader for the file
    private long dataOffset; // Offset to the beginning of the variable width portion
    private int entitySize; // Size of a rows in the fixed width portion
    private List<Field> fields; // List of fields in the rows, sorted by @Order
    private Class<?> recordType; // Class to map records to
    private int count; // Number of records in the fixed width portion
    private FieldReader[] fieldReaders;

    /**
     * Create a new .dat file reader.
     *
     * @param file Path to the .dat file
     */
    public DatFileReader(File file, FieldReader[] fieldReaders) {
        this.file = file;
        this.fieldReaders = fieldReaders;

        recordType = entityClasses.get(Files.getNameWithoutExtension(file.getName()));
        Assert.notNull(recordType, "Could not find rows class for '" + file.getName() + "'");

        // Get fields with @Order and sort them
        Comparator<Field> byOrder = (o1, o2) -> Integer.compare(o1.getAnnotation(Order.class).value(), o2.getAnnotation(Order.class).value());
        fields = Arrays.stream(recordType.getDeclaredFields())
                .filter(field -> field.getAnnotation(Order.class) != null)
                .sorted(byOrder)
                .collect(Collectors.toList());

        // Read basic stuff from the rows
        br = new MappedBinaryReader(file, "r");
        count = br.readInt();

        entitySize = getEntitySize(recordType);
        dataOffset = 4 + entitySize * count;

        // Check that the rows size is correct
        br.setPosition(dataOffset);
        long magic = br.readLong();
        Assert.isTrue(magic == Constants.MAGIC_DATA_SEPARATOR, "Data separator incorrect, rows size wrong");
        br.setPosition(4);
    }

    public BiMap<String, Class<?>> getEntityClasses() {
        return entityClasses;
    }

    @Override
    public void close() throws IOException {
        if (br != null) {
            br.close();
        }
    }

    private T cacheGet(long index) {
        String key = index + ":" + file.getName();
        if (recordCache.getIfPresent(key) != null) {
            return (T) recordCache.getIfPresent(key);
        }

        return null;
    }

    private void cachePut(T record) {
        String key = record.getIndex() + ":" + file.getName();
        recordCache.put(key, record);
    }

    private void checkBounds(long index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
    }

    /**
     * Read a specific rows from the file by index.
     *
     * @param index Index of the rows, starts at 0.
     * @return The specified rows
     */
    public T read(long index) {
        checkBounds(index);

        if (cacheGet(index) != null) {
            return cacheGet(index);
        }

        log.info("Reading '" + index + "' from '" + file.getName() + "'");

        long recordOffset = index * entitySize + 4; // Index + size of rows + header
        if (br.getPosition() != recordOffset) {
            br.setPosition(recordOffset);
        }

        Map<String, Object> values = new HashMap<>(fields.size() + 1);
        values.put("index", index);
        values.put("offset", recordOffset);

        for (Field field : fields) {
            values.put(field.getName(), readField(field));
        }

        BeanWrapper wrapper = new BeanWrapperImpl(recordType);
        wrapper.setPropertyValues(values);
        T value = (T) wrapper.getWrappedInstance();

        cachePut(value);

        return value;
    }

    public Stream<T> read() {
        return IntStream.range(0, count)
                .mapToObj(this::read);
    }

    private Object readField(Field field) {
        for (FieldReader fieldReader : fieldReaders) {
            if (fieldReader.supports(field)) {
                return fieldReader.read(this, field);
            }
        }

        throw new Poe4jException(MessageFormat.format("Could not find FieldReader for '{0}'", field));
    }

    /**
     * Calculate the size of a rows.
     *
     * @param clazz
     * @return
     */
    private int getEntitySize(Class<?> clazz) {
        int size = 0;

        for (Field field : clazz.getDeclaredFields()) {
            FieldReader fieldReader = Arrays.stream(fieldReaders)
                    .filter(fieldReader1 -> fieldReader1.supports(field))
                    .findFirst()
                    .orElseThrow(() -> new Poe4jException(MessageFormat.format("Could not find FieldReader for '{0}'", field)));
            size += fieldReader.size(field);
        }

        return size;
    }

    public BinaryReader getBr() {
        return br;
    }

    public long getDataOffset() {
        return dataOffset;
    }

    public File getFile() {
        return file;
    }
}
