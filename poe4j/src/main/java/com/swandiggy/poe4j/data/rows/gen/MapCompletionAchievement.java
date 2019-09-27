
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MapCompletionAchievements")
public class MapCompletionAchievement
    extends BaseRow
{

    @Order(0)
    private String unknown0;
    @Order(1)
    private List<MapStatConditions> mapStatConditionsKeys;
    @Order(2)
    private List<Stats> statsKeys;
    @Order(3)
    private List<AchievementItems> achievementItemsKeys;
    @Order(4)
    private List<MapTierAchievements> mapTierAchievementsKeys;
    @Order(5)
    private Byte unknown11;
    @Order(6)
    private List<WorldAreas> worldAreasKeys;

}
