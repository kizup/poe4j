
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("UniqueMapInfo")
public class UniqueMapInfo
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private Long key1;
    @Order(2)
    private FlavourText flavourTextKey;
    @Order(3)
    private ItemVisualIdentity itemVisualIdentityKey;
    @Order(4)
    private Byte flag0;

}
