
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DelveUpgrades")
public class DelveUpgrade
    extends BaseRow
{

    @Order(0)
    private Integer delveUpgradeTypeKey;
    @Order(1)
    private Integer upgradeLevel;
    @Order(2)
    private List<Stats> statsKeys;
    @Order(3)
    private List<Integer> statValues;
    @Order(4)
    private Integer cost;
    @Order(5)
    private Integer unknown2;
    @Order(6)
    private AchievementItems achievementItemsKey;
    @Order(7)
    private Integer unknown3;

}
