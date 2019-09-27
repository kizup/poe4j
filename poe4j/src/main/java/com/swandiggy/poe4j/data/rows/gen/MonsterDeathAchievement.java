
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterDeathAchievements")
public class MonsterDeathAchievement
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<MonsterVarieties> monsterVarietiesKeys;
    @Order(2)
    private List<AchievementItems> achievementItemsKeys;
    @Order(3)
    private Byte flag0;
    @Order(4)
    private List<PlayerConditions> playerConditionsKeys;
    @Order(5)
    private List<MonsterDeathConditions> monsterDeathConditionsKeys;
    @Order(6)
    private List<Long> unknown5;
    @Order(7)
    private Integer unknown6;
    @Order(8)
    private Integer unknown7;
    @Order(9)
    private Byte flag1;
    @Order(10)
    private Long unknown8;
    @Order(11)
    private List<Long> unknown9;
    @Order(12)
    private List<Long> unknown10;
    @Order(13)
    private List<Long> unknown11;
    @Order(14)
    private Long unknown12;
    @Order(15)
    private Integer unknown13;
    @Order(16)
    private List<NearbyMonsterConditions> nearbyMonsterConditionsKeys;
    @Order(17)
    private Byte flag3;
    @Order(18)
    private List<MultiPartAchievementConditions> multiPartAchievementConditionsKeys;
    @Order(19)
    private Integer unknown16;

}
