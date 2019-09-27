
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BetrayalTargets")
public class BetrayalTargets
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private BetrayalRelationshipState betrayalRelationshipStateKey;
    @Order(2)
    private MonsterVarieties monsterVarietiesKey;
    @Order(3)
    private BetrayalJob betrayalJobsKey;
    @Order(4)
    private String art;
    @Order(5)
    private Byte flag0;
    @Order(6)
    private Long key3;
    @Order(7)
    private String fullName;
    @Order(8)
    private String safehouse_ARMFile;
    @Order(9)
    private String shortName;
    @Order(10)
    private Integer unknown0;
    @Order(11)
    private AchievementItems safehouseLeader_AcheivementItemsKey;
    @Order(12)
    private AchievementItems level3_AchievementItemsKey;
    @Order(13)
    private Integer unknown1;
    @Order(14)
    private Integer unknown2;
    @Order(15)
    private Integer unknown3;

}
