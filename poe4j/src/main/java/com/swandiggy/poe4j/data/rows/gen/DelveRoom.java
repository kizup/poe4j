
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DelveRooms")
public class DelveRoom
    extends BaseRow
{

    @Order(0)
    private DelveBiome delveBiomesKey;
    @Order(1)
    private DelveFeature delveFeaturesKey;
    @Order(2)
    private String aRMFile;

}
