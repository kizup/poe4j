
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LabyrinthRewards")
public class LabyrinthReward
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Chests chestsKey;
    @Order(2)
    private Integer spawnWeight;
    @Order(3)
    private Long unknown3;
    @Order(4)
    private Integer minLabyrinthTier;
    @Order(5)
    private Integer maxLabyrinthTier;
    @Order(6)
    private LabyrinthRewardType labyrinthRewardTypesKey;

}
