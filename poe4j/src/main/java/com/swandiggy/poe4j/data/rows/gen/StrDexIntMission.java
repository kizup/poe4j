
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrDexIntMissions")
public class StrDexIntMission
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Long key0;
    @Order(2)
    private Integer spawnWeight;
    @Order(3)
    private Long key1;
    @Order(4)
    private Long key2;
    @Order(5)
    private List<Mods> extra_ModsKeys;
    @Order(6)
    private Byte flag0;
    @Order(7)
    private Byte flag1;
    @Order(8)
    private Byte flag2;
    @Order(9)
    private Long key3;
    @Order(10)
    private Integer unknown12;
    @Order(11)
    private Integer unknown13;
    @Order(12)
    private Integer unknown14;
    @Order(13)
    private Integer unknown15;
    @Order(14)
    private Long key4;
    @Order(15)
    private Long key5;
    @Order(16)
    private Long key6;
    @Order(17)
    private Byte flag3;

}
