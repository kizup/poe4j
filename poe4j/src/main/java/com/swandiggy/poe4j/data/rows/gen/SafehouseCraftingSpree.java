
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SafehouseCraftingSpree")
public class SafehouseCraftingSpree
    extends BaseRow
{

    @Order(0)
    private BetrayalJob betrayalJobsKey;
    @Order(1)
    private BetrayalRank betrayalRanksKey;
    @Order(2)
    private List<Integer> currency_Values;
    @Order(3)
    private Integer chance;
    @Order(4)
    private List<SafehouseCraftingSpreeCurrencies> currency_SafehouseCraftingSpreeCurrenciesKeys;
    @Order(5)
    private List<Integer> data0;

}
