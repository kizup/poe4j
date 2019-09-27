
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MiscEffectPacks")
public class MiscEffectPack
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String ePKFile;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private List<Long> keys0;
    @Order(6)
    private Byte flag0;
    @Order(7)
    private String playerOnly_EPKFile;

}
