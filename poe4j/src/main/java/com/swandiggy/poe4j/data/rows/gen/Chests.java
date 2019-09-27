
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Chests")
public class Chests
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Boolean flag0;
    @Order(2)
    private Integer unknown0;
    @Order(3)
    private String name;
    @Order(4)
    private String aOFile;
    @Order(5)
    private Boolean flag1;
    @Order(6)
    private Boolean flag2;
    @Order(7)
    private Integer unknown1;
    @Order(8)
    private Boolean flag3;
    @Order(9)
    private Boolean flag4;
    @Order(10)
    private Integer unknown2;
    @Order(11)
    private List<Long> unknown_Keys;
    @Order(12)
    private List<Integer> unknown_Values;
    @Order(13)
    private BaseItemTypes baseItemTypesKey;
    @Order(14)
    private Boolean flag5;
    @Order(15)
    private List<Mods> modsKeys;
    @Order(16)
    private List<Tags> tagsKeys;
    @Order(17)
    private ChestEffect chestEffectsKey;
    @Order(18)
    private Integer minLevel;
    @Order(19)
    private String unknown3;
    @Order(20)
    private Integer maxLevel;
    @Order(21)
    private AchievementItems corrupt_AchievementItemsKey;
    @Order(22)
    private AchievementItems currencyUse_AchievementItemsKey;
    @Order(23)
    private List<AchievementItems> encounter_AchievementItemsKeys;
    @Order(24)
    private Long key4;
    @Order(25)
    private String inheritsFrom;
    @Order(26)
    private Boolean flag6;
    @Order(27)
    private Long key5;

}
