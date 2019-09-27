
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("RecipeUnlockDisplay")
public class RecipeUnlockDisplay
    extends BaseRow
{

    @Order(0)
    private Integer recipeId;
    @Order(1)
    private String description;
    @Order(2)
    private List<CraftingItemClassCategories> craftingItemClassCategoriesKeys;
    @Order(3)
    private String unlockDescription;
    @Order(4)
    private Integer rank;

}
