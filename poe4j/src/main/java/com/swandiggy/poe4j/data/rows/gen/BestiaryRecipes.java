
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BestiaryRecipes")
public class BestiaryRecipes
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String description;
    @Order(2)
    private List<BestiaryRecipeComponent> bestiaryRecipeComponentKeys;
    @Order(3)
    private String notes;
    @Order(4)
    private String hintText;
    @Order(5)
    private Boolean flag0;
    @Order(6)
    private List<AchievementItems> achievementItemsKeys;
    @Order(7)
    private Boolean flag1;
    @Order(8)
    private Integer unknown1;

}
