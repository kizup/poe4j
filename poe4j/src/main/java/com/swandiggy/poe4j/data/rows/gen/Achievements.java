
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Achievements")
public class Achievements
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String description;
    @Order(2)
    @Reference(Integer.class)
    private AchievementSetsDisplay achievementSetsDisplayKey;
    @Order(3)
    private String objective;
    @Order(4)
    private Integer unknownUnique;
    @Order(5)
    private Boolean flag0;
    @Order(6)
    private Boolean flag1;
    @Order(7)
    private Boolean flag2;
    @Order(8)
    private Integer unknown3;
    @Order(9)
    private Boolean flag3;
    @Order(10)
    private Boolean flag4;
    @Order(11)
    private String unknown1;
    @Order(12)
    private Boolean flag5;
    @Order(13)
    private Boolean flag6;
    @Order(14)
    private Boolean flag7;
    @Order(15)
    private String unknown2;

}
