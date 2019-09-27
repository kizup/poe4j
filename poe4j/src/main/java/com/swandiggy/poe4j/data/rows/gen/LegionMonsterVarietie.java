
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LegionMonsterVarieties")
public class LegionMonsterVarietie
    extends BaseRow
{

    @Order(0)
    private MonsterVarieties monsterVarietiesKey;
    @Order(1)
    private LegionFactions legionFactionsKey;
    @Order(2)
    private Long key1;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private List<Long> keys0;
    @Order(5)
    private Integer unknown5;
    @Order(6)
    private Integer unknown6;
    @Order(7)
    private List<Integer> unknown7;
    @Order(8)
    private List<Integer> unknown8;
    @Order(9)
    private List<Integer> unknown9;
    @Order(10)
    private List<Integer> unknown10;
    @Order(11)
    private List<Integer> unknown11;
    @Order(12)
    private List<Integer> unknown12;
    @Order(13)
    private Integer unknown13;
    @Order(14)
    private Integer unknown14;
    @Order(15)
    private List<Long> keys1;
    @Order(16)
    private Long key0;

}
