
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LegionRewards")
public class LegionReward
    extends BaseRow
{

    @Order(0)
    private LegionFactions legionFactionsKey;
    @Order(1)
    private Long key1;
    @Order(2)
    private List<LegionRewardType> legionRewardTypesKeys;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private Float unknown5;
    @Order(6)
    private Boolean flag0;
    @Order(7)
    private Integer unknown6;
    @Order(8)
    private Float unknown7;

}
