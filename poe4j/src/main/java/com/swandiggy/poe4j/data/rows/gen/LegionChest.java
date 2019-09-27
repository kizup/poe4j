
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LegionChests")
public class LegionChest
    extends BaseRow
{

    @Order(0)
    private Chests chestsKey;
    @Order(1)
    private LegionFactions legionFactionsKey;
    @Order(2)
    private LegionRanks legionRanksKey;
    @Order(3)
    private Long key1;
    @Order(4)
    private Integer unknown4;

}
