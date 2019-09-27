
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BestiaryEncounters")
public class BestiaryEncounter
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer minLevel;
    @Order(2)
    private Integer maxLevel;
    @Order(3)
    private Integer spawnWeight;
    @Order(4)
    private MonsterPacks monsterPacksKey;
    @Order(5)
    private String monsterSpawnerId;

}
