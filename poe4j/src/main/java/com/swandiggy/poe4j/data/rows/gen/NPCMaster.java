
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NPCMaster")
public class NPCMaster
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Short unknown14;
    @Order(2)
    private Mods signature_ModsKey;
    @Order(3)
    private Byte flag0;
    @Order(4)
    private List<Tags> spawnWeight_TagsKeys;
    @Order(5)
    private List<Integer> spawnWeight_Values;
    @Order(6)
    private List<Integer> data0;
    @Order(7)
    private List<Integer> data1;
    @Order(8)
    private Long key1;
    @Order(9)
    private String helpText;
    @Order(10)
    private String helpTextForNextLevel;
    @Order(11)
    private Long key2;
    @Order(12)
    private Integer unknown0;
    @Order(13)
    private String areaDescription;
    @Order(14)
    private Long key3;

}
