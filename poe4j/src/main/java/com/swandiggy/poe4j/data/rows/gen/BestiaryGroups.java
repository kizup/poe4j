
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BestiaryGroups")
public class BestiaryGroups
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String description;
    @Order(2)
    private String illustraiton;
    @Order(3)
    private String name;
    @Order(4)
    private String icon;
    @Order(5)
    private String iconSmall;
    @Order(6)
    private BestiaryFamilie bestiaryFamiliesKey;
    @Order(7)
    private List<AchievementItems> achievementItemsKeys;

}
