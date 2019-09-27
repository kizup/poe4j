
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DelveFeatureRewards")
public class DelveFeatureReward
    extends BaseRow
{

    @Order(0)
    private DelveFeature delveFeaturesKey;
    @Order(1)
    private List<Long> delveRewardsKey;

}
