
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SafehouseCraftingSpreeCurrencies")
public class SafehouseCraftingSpreeCurrencies
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private BaseItemTypes baseItemTypesKey;
    @Order(2)
    private Boolean hasSpecificBaseItem;

}
