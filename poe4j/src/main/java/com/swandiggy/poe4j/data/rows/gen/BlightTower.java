
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BlightTowers")
public class BlightTower
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private String description;
    @Order(3)
    private String icon;
    @Order(4)
    private List<Integer> unknown4;
    @Order(5)
    private Integer unknown5;
    @Order(6)
    private String tier;
    @Order(7)
    private Integer radius;
    @Order(8)
    private Integer unknown8;
    @Order(9)
    private AchievementItems spendResourceAchievementItemsKey;
    @Order(10)
    private Stats statsKey;
    @Order(11)
    private List<Stats> statsKeys;
    @Order(12)
    private List<Long> keys0;
    @Order(13)
    private Boolean flag0;

}
