
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BreachstoneUpgrades")
public class BreachstoneUpgrade
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey0;
    @Order(1)
    private BaseItemTypes baseItemTypesKey1;
    @Order(2)
    private BaseItemTypes baseItemTypesKey2;
    @Order(3)
    private BaseItemTypes baseItemTypesKey3;

}
