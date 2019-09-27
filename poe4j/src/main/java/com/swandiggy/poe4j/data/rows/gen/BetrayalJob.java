
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BetrayalJobs")
public class BetrayalJob
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String text;
    @Order(2)
    private Long key0;
    @Order(3)
    private String art;
    @Order(4)
    private Integer unknown0;
    @Order(5)
    private Integer unknown1;
    @Order(6)
    private Long key1;
    @Order(7)
    private AchievementItems completion_AchievementItemsKey;
    @Order(8)
    private AchievementItems openChests_AchievementItemsKey;
    @Order(9)
    private AchievementItems missionCompletion_AcheivementItemsKey;

}
