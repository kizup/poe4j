
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MapSeriesTiers")
public class MapSeriesTier
    extends BaseRow
{

    @Order(0)
    private Maps mapsKey;
    @Order(1)
    private Integer mapWorldsTier;
    @Order(2)
    private Integer betrayalTier;
    @Order(3)
    private Integer synthesisTier;
    @Order(4)
    private Integer legionTier;
    @Order(5)
    private Integer blightTier;

}
