
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MultiPartAchievements")
public class MultiPartAchievements
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer unknown0;
    @Order(2)
    private AchievementItems achievementItemsKey;
    @Order(3)
    private Integer unknown4;
    @Order(4)
    private Boolean flag0;
    @Order(5)
    private Boolean flag1;
    @Order(6)
    private Integer unknown1;

}
