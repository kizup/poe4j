
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ShopPaymentPackageItems")
public class ShopPaymentPackageItem
    extends BaseRow
{

    @Order(0)
    private Integer id;
    @Order(1)
    private ShopPaymentPackage shopPaymentPackageKey;
    @Order(2)
    private Long shopItemKey;
    @Order(3)
    private String unknown0;
    @Order(4)
    private ShopToken shopTokenKey;

}
