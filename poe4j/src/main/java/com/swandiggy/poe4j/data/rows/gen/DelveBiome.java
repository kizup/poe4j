
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DelveBiomes")
public class DelveBiome
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private List<WorldAreas> worldAreasKeys;
    @Order(3)
    private String uIImage;
    @Order(4)
    private List<Integer> spawnWeight_Depth;
    @Order(5)
    private List<Integer> spawnWeight_Values;
    @Order(6)
    private List<Integer> data2;
    @Order(7)
    private List<Integer> data3;
    @Order(8)
    private String2DArt;
    @Order(9)
    private List<AchievementItems> achievementItemsKeys;
    @Order(10)
    private Boolean flag0;
    @Order(11)
    private List<Integer> unknown0;

}
