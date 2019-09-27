
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BaseItemTypes")
public class BaseItemTypes
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private ItemClasses itemClassesKey;
    @Order(2)
    private Integer width;
    @Order(3)
    private Integer height;
    @Order(4)
    private String name;
    @Order(5)
    private String inheritsFrom;
    @Order(6)
    private Integer dropLevel;
    @Order(7)
    private FlavourText flavourTextKey;
    @Order(8)
    private List<Mods> implicit_ModsKeys;
    @Order(9)
    private Integer unknown1;
    @Order(10)
    private SoundEffects soundEffectsKey;
    @Order(11)
    private List<BaseItemTypes> normalPurchase_BaseItemTypesKeys;
    @Order(12)
    private List<Integer> normalPurchase_Costs;
    @Order(13)
    private List<BaseItemTypes> magicPurchase_BaseItemTypesKeys;
    @Order(14)
    private List<Integer> magicPurchase_Costs;
    @Order(15)
    private List<Tags> tagsKeys;
    @Order(16)
    private Integer modDomainsKey;
    @Order(17)
    private Boolean flag0;
    @Order(18)
    private ItemVisualIdentity itemVisualIdentityKey;
    @Order(19)
    private Integer unknownUnique;
    @Order(20)
    private List<AchievementItems> vendorRecipe_AchievementItemsKeys;
    @Order(21)
    private List<BaseItemTypes> rarePurchase_BaseItemTypesKeys;
    @Order(22)
    private List<Integer> rarePurchase_Costs;
    @Order(23)
    private List<BaseItemTypes> uniquePurchase_BaseItemTypesKeys;
    @Order(24)
    private List<Integer> uniquePurchase_Costs;
    @Order(25)
    private String inflection;
    @Order(26)
    private AchievementItems equip_AchievementItemsKey;
    @Order(27)
    private Boolean isPickedUpByMonsters;
    @Order(28)
    private List<AchievementItems> identify_AchievementItemsKeys;
    @Order(29)
    private ItemThemes itemThemesKey;
    @Order(30)
    private List<AchievementItems> identifyMagic_AchievementItemsKeys;
    @Order(31)
    private BaseItemTypes fragmentBaseItemTypesKey;
    @Order(32)
    private Boolean isBlessing;
    @Order(33)
    private Integer unknown0;

}
