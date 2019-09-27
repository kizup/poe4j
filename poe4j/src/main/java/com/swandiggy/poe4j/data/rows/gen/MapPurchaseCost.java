
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MapPurchaseCosts")
public class MapPurchaseCost
    extends BaseRow
{

    @Order(0)
    private Integer tier;
    @Order(1)
    private List<BaseItemTypes> normalPurchase_BaseItemTypesKeys;
    @Order(2)
    private List<Integer> normalPurchase_Costs;
    @Order(3)
    private List<BaseItemTypes> magicPurchase_BaseItemTypesKeys;
    @Order(4)
    private List<Integer> magicPurchase_Costs;
    @Order(5)
    private List<BaseItemTypes> rarePurchase_BaseItemTypesKeys;
    @Order(6)
    private List<Integer> rarePurchase_Costs;
    @Order(7)
    private List<BaseItemTypes> uniquePurchase_BaseItemTypesKeys;
    @Order(8)
    private List<Integer> uniquePurchase_Costs;

}
