
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LegionFactions")
public class LegionFactions
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private Long key0;
    @Order(3)
    private Float unknown3;
    @Order(4)
    private Float unknown4;
    @Order(5)
    private Long key1;
    @Order(6)
    private Long key2;
    @Order(7)
    private Long key3;
    @Order(8)
    private Long key4;
    @Order(9)
    private List<AchievementItems> achievementItemsKeys1;
    @Order(10)
    private Long key5;
    @Order(11)
    private Long key6;
    @Order(12)
    private Float unknown12;
    @Order(13)
    private Float unknown13;
    @Order(14)
    private List<AchievementItems> achievementItemsKeys2;

}
