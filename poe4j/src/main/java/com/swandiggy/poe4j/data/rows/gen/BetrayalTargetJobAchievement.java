
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BetrayalTargetJobAchievements")
public class BetrayalTargetJobAchievement
    extends BaseRow
{

    @Order(0)
    private BetrayalTargets betrayalTargetsKey;
    @Order(1)
    private BetrayalJob betrayalJobsKey;
    @Order(2)
    private AchievementItems achievementItemsKey;

}
