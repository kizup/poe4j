
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("CraftingBenchOptions")
public class CraftingBenchOption
    extends BaseRow
{

    @Order(0)
    private HideoutNPCs hideoutNPCsKey;
    @Order(1)
    private Integer order;
    @Order(2)
    private Mods modsKey;
    @Order(3)
    private List<BaseItemTypes> cost_BaseItemTypesKeys;
    @Order(4)
    private List<Integer> cost_Values;
    @Order(5)
    private Integer requiredLevel;
    @Order(6)
    private String name;
    @Order(7)
    private Integer craftingBenchCustomAction;
    @Order(8)
    private List<ItemClasses> itemClassesKeys;
    @Order(9)
    private Integer links;
    @Order(10)
    private String socketColours;
    @Order(11)
    private Integer sockets;
    @Order(12)
    private Integer itemQuantity;
    @Order(13)
    private List<Integer> data0;
    @Order(14)
    private String description;
    @Order(15)
    private Boolean isDisabled;
    @Order(16)
    private Boolean isAreaOption;
    @Order(17)
    private List<RecipeUnlockDisplay> recipeIds;
    @Order(18)
    private Integer tier;
    @Order(19)
    private String modFamily;
    @Order(20)
    private List<CraftingItemClassCategories> craftingItemClassCategoriesKeys;
    @Order(21)
    private Integer maximumMapTier;
    @Order(22)
    private CraftingBenchUnlockCategories craftingBenchUnlockCategoriesKey;
    @Order(23)
    private Integer unveilsRequired;
    @Order(24)
    private Integer unveilsRequired2;
    @Order(25)
    private String affixType;
    @Order(26)
    private List<Long> keys1;
    @Order(27)
    private List<Long> keys2;
    @Order(28)
    private List<AchievementItems> achievementItemsKeys;

}
