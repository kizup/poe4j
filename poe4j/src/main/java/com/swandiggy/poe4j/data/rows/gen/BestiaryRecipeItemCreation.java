
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BestiaryRecipeItemCreation")
public class BestiaryRecipeItemCreation
    extends BaseRow
{

    @Order(0)
    private BestiaryRecipes bestiaryRecipesKey;
    @Order(1)
    private Long key0;
    @Order(2)
    private String command;

}
