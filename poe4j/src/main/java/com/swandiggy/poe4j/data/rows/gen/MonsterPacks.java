
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterPacks")
public class MonsterPacks
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<WorldAreas> worldAreasKeys;
    @Order(2)
    private Integer unknown0;
    @Order(3)
    private Integer unknown1;
    @Order(4)
    private Integer bossMonsterSpawnChance;
    @Order(5)
    private Integer bossMonsterCount;
    @Order(6)
    private List<MonsterVarieties> bossMonster_MonsterVarietiesKeys;
    @Order(7)
    private Boolean flag0;
    @Order(8)
    private Integer unknown2;
    @Order(9)
    private List<String> data1;
    @Order(10)
    private List<Tags> tagsKeys;
    @Order(11)
    private Integer minLevel;
    @Order(12)
    private Integer maxLevel;
    @Order(13)
    private List<Long> keys0;
    @Order(14)
    private Integer unknown3;

}
