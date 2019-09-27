
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AchievementSetRewards")
public class AchievementSetReward
    extends BaseRow
{

    @Order(0)
    @Reference(Integer.class)
    private AchievementSetsDisplay achievementSetsDisplayKey;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private List<BaseItemTypes> baseItemTypesKeys;
    @Order(3)
    private Integer unknown2;
    @Order(4)
    private String message;

}
