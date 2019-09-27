
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("RecipeUnlockObjects")
public class RecipeUnlockObject
    extends BaseRow
{

    @Order(0)
    private WorldAreas worldAreasKey;
    @Order(1)
    private String inheritsFrom;
    @Order(2)
    private Integer recipeId;

}
