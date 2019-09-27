
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("TencentAutoLootPetCurrenciesExcludable")
public class TencentAutoLootPetCurrenciesExcludable
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;

}
