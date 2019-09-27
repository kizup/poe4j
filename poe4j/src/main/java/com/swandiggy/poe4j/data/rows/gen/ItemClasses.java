
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ItemClasses")
public class ItemClasses
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private String category;
    @Order(3)
    private Integer unknown0;
    @Order(4)
    private Tags elder_TagsKey;
    @Order(5)
    private Tags shaper_TagsKey;
    @Order(6)
    private Boolean flag0;
    @Order(7)
    private List<AchievementItems> achievementItemsKeys;
    @Order(8)
    private List<AchievementItems> identify_AchievementItemsKeys;

}
