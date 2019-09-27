
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MapDeviceRecipes")
public class MapDeviceRecipe
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<BaseItemTypes> baseItemTypesKeys;
    @Order(2)
    private WorldAreas worldAreasKey;
    @Order(3)
    private Long key0;
    @Order(4)
    private Integer areaLevel;
    @Order(5)
    private Integer unknown0;
    @Order(6)
    private Integer unknown1;
    @Order(7)
    private Boolean isLegionMap;

}
