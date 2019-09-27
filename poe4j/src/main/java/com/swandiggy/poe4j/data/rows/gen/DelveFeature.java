
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DelveFeatures")
public class DelveFeature
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private List<Integer> spawnWeight;
    @Order(3)
    private WorldAreas worldAreasKey;
    @Order(4)
    private String image;
    @Order(5)
    private List<AchievementItems> achievementItemsKeys;
    @Order(6)
    private Integer minTier;
    @Order(7)
    private Integer tier;
    @Order(8)
    private List<Integer> minDepth;
    @Order(9)
    private String description;
    @Order(10)
    private Integer unknown0;
    @Order(11)
    private List<Integer> data1;
    @Order(12)
    private List<Integer> data2;
    @Order(13)
    private List<Integer> data3;

}
