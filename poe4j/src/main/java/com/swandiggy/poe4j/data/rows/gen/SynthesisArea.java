
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SynthesisAreas")
public class SynthesisArea
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer minLevel;
    @Order(2)
    private Integer maxLevel;
    @Order(3)
    private Integer weight;
    @Order(4)
    private Topologies topologiesKey;
    @Order(5)
    private List<MonsterPacks> monsterPacksKeys;
    @Order(6)
    private String artFile;
    @Order(7)
    private String name;
    @Order(8)
    private SynthesisAreaSize synthesisAreaSizeKey;
    @Order(9)
    private AchievementItems achievementItemsKey;

}
