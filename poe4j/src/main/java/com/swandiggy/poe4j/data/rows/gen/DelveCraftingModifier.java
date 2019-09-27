
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DelveCraftingModifiers")
public class DelveCraftingModifier
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private List<Mods> addedModKeys;
    @Order(2)
    private List<Tags> negativeWeight_TagsKeys;
    @Order(3)
    private List<Integer> negativeWeight_Values;
    @Order(4)
    private List<Mods> forcedAddModKeys;
    @Order(5)
    private List<DelveCraftingTags> forbiddenDelveCraftingTagsKeys;
    @Order(6)
    private List<DelveCraftingTags> allowedDelveCraftingTagsKeys;
    @Order(7)
    private Boolean canMirrorItem;
    @Order(8)
    private Integer corruptedEssenceChance;
    @Order(9)
    private Boolean canImproveQuality;
    @Order(10)
    private Boolean canRollEnchant;
    @Order(11)
    private Boolean hasLuckyRolls;
    @Order(12)
    private List<Mods> sellPrice_ModsKeys;
    @Order(13)
    private Boolean canRollWhiteSockets;
    @Order(14)
    private List<Tags> weight_TagsKeys;
    @Order(15)
    private List<Integer> weight_Values;
    @Order(16)
    private List<DelveCraftingModifierDescription> delveCraftingModifierDescriptionsKeys;
    @Order(17)
    private List<DelveCraftingModifierDescription> blockedDelveCraftingModifierDescriptionsKeys;

}
