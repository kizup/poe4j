
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SpawnAdditionalChestsOrClusters")
public class SpawnAdditionalChestsOrCluster
    extends BaseRow
{

    @Order(0)
    private Stats statsKey;
    @Order(1)
    private Chests chestsKey;
    @Order(2)
    private ChestCluster chestClustersKey;

}
