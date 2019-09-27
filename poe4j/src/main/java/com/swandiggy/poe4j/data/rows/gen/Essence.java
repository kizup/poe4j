
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Essences")
public class Essence
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private Long unknown1;
    @Order(2)
    private Long unknown2;
    @Order(3)
    private Long unknown3;
    @Order(4)
    private Long unknown4;
    @Order(5)
    private Long unknown5;
    @Order(6)
    private Long unknown6;
    @Order(7)
    private Long unknown7;
    @Order(8)
    private Long unknown8;
    @Order(9)
    private Long unknown9;
    @Order(10)
    private Long unknown10;
    @Order(11)
    private Long unknown11;
    @Order(12)
    private Mods display_Wand_ModsKey;
    @Order(13)
    private Mods display_Bow_ModsKey;
    @Order(14)
    private Mods display_Quiver_ModsKey;
    @Order(15)
    private Mods display_Amulet_ModsKey;
    @Order(16)
    private Mods display_Ring_ModsKey;
    @Order(17)
    private Mods display_Belt_ModsKey;
    @Order(18)
    private Mods display_Gloves_ModsKey;
    @Order(19)
    private Mods display_Boots_ModsKey;
    @Order(20)
    private Mods display_BodyArmour_ModsKey;
    @Order(21)
    private Mods display_Helmet_ModsKey;
    @Order(22)
    private Mods display_Shield_ModsKey;
    @Order(23)
    private Integer unknown23;
    @Order(24)
    private Integer dropLevelMinimum;
    @Order(25)
    private Integer dropLevelMaximum;
    @Order(26)
    private List<Mods> monster_ModsKeys;
    @Order(27)
    private EssenceType essenceTypeKey;
    @Order(28)
    private Integer level;
    @Order(29)
    private Integer unknown31;
    @Order(30)
    private Mods display_Weapon_ModsKey;
    @Order(31)
    private Mods display_MeleeWeapon_ModsKey;
    @Order(32)
    private Mods display_OneHandWeapon_ModsKey;
    @Order(33)
    private Mods display_TwoHandWeapon_ModsKey;
    @Order(34)
    private Mods display_TwoHandMeleeWeapon_ModsKey;
    @Order(35)
    private Mods display_Armour_ModsKey;
    @Order(36)
    private Mods display_RangedWeapon_ModsKey;
    @Order(37)
    private Mods helmet_ModsKey;
    @Order(38)
    private Mods bodyArmour_ModsKey;
    @Order(39)
    private Mods boots_ModsKey;
    @Order(40)
    private Mods gloves_ModsKey;
    @Order(41)
    private Mods bow_ModsKey;
    @Order(42)
    private Mods wand_ModsKey;
    @Order(43)
    private Mods staff_ModsKey;
    @Order(44)
    private Mods twoHandSword_ModsKey;
    @Order(45)
    private Mods twoHandAxe_ModsKey;
    @Order(46)
    private Mods twoHandMace_ModsKey;
    @Order(47)
    private Mods claw_ModsKey;
    @Order(48)
    private Mods dagger_ModsKey;
    @Order(49)
    private Mods oneHandSword_ModsKey;
    @Order(50)
    private Mods oneHandThrustingSword_ModsKey;
    @Order(51)
    private Mods oneHandAxe_ModsKey;
    @Order(52)
    private Mods oneHandMace_ModsKey;
    @Order(53)
    private Mods sceptre_ModsKey;
    @Order(54)
    private Mods display_Monster_ModsKey;
    @Order(55)
    private Integer itemLevelRestriction;
    @Order(56)
    private Mods belt_ModsKey;
    @Order(57)
    private Mods amuletsModsKey;
    @Order(58)
    private Mods ring_ModsKey;
    @Order(59)
    private Mods display_Jewellery_ModsKey;
    @Order(60)
    private Mods shield_ModsKey;
    @Order(61)
    private Mods display_Items_ModsKey;
    @Order(62)
    private Boolean isScreamingEssence;

}
