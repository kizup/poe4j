
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DelveAzuriteShop")
public class DelveAzuriteShop
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private Integer spawnWeight;
    @Order(2)
    private Integer cost;
    @Order(3)
    private Integer minDepth;
    @Order(4)
    private Boolean isEnabled;

}
