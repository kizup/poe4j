
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterVarieties")
public class MonsterVarieties
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private MonsterType monsterTypesKey;
    @Order(2)
    private Integer unknown0;
    @Order(3)
    private Integer objectSize;
    @Order(4)
    private Integer minimumAttackDistance;
    @Order(5)
    private Integer maximumAttackDistance;
    @Order(6)
    private String aCTFile;
    @Order(7)
    private String aOFile;
    @Order(8)
    private String baseMonsterTypeIndex;
    @Order(9)
    private List<Mods> modsKeys;
    @Order(10)
    private Integer unknown12;
    @Order(11)
    private Integer unknown13;
    @Order(12)
    private Integer unknown14;
    @Order(13)
    private Integer modelSizeMultiplier;
    @Order(14)
    private Integer unknown16;
    @Order(15)
    private Integer unknown17;
    @Order(16)
    private Integer unknown18;
    @Order(17)
    private Integer unknown19;
    @Order(18)
    private Integer unknown20;
    @Order(19)
    private List<Tags> tagsKeys;
    @Order(20)
    private Integer experienceMultiplier;
    @Order(21)
    private List<Integer> unknown7;
    @Order(22)
    private Integer unknown26;
    @Order(23)
    private Integer unknown27;
    @Order(24)
    private Integer unknown28;
    @Order(25)
    private Integer criticalStrikeChance;
    @Order(26)
    private Integer unknown30;
    @Order(27)
    private List<GrantedEffect> grantedEffectsKeys;
    @Order(28)
    private String aISFile;
    @Order(29)
    private List<Mods> modsKeys2;
    @Order(30)
    private Integer unknown36;
    @Order(31)
    private Long key2;
    @Order(32)
    private String name;
    @Order(33)
    private Integer damageMultiplier;
    @Order(34)
    private Integer lifeMultiplier;
    @Order(35)
    private Integer attackSpeed;
    @Order(36)
    private List<ItemVisualIdentity> weapon1_ItemVisualIdentityKeys;
    @Order(37)
    private List<ItemVisualIdentity> weapon2_ItemVisualIdentityKeys;
    @Order(38)
    private ItemVisualIdentity back_ItemVisualIdentityKey;
    @Order(39)
    private ItemClasses mainHand_ItemClassesKey;
    @Order(40)
    private ItemClasses offHand_ItemClassesKey;
    @Order(41)
    private Long key1;
    @Order(42)
    private ItemVisualIdentity helmet_ItemVisualIdentityKey;
    @Order(43)
    private Integer unknown57;
    @Order(44)
    private List<AchievementItems> killSpecificMonsterCount_AchievementItemsKeys;
    @Order(45)
    private List<Mods> special_ModsKeys;
    @Order(46)
    private List<AchievementItems> killRare_AchievementItemsKeys;
    @Order(47)
    private Boolean flag0;
    @Order(48)
    private Integer unknown64;
    @Order(49)
    private Integer unknown65;
    @Order(50)
    private Integer unknown66;
    @Order(51)
    private Integer unknown67;
    @Order(52)
    private Integer unknown68;
    @Order(53)
    private Integer unknown69;
    @Order(54)
    private Integer unknown70;
    @Order(55)
    private Integer unknown71;
    @Order(56)
    private Byte flag1;
    @Order(57)
    private AchievementItems killWhileOnslaughtIsActive_AchievementItemsKey;
    @Order(58)
    private MonsterSegment monsterSegmentsKey;
    @Order(59)
    private MonsterArmour monsterArmoursKey;
    @Order(60)
    private AchievementItems killWhileTalismanIsActive_AchievementItemsKey;
    @Order(61)
    private List<Mods> part1_ModsKeys;
    @Order(62)
    private List<Mods> part2_ModsKeys;
    @Order(63)
    private List<Mods> endgame_ModsKeys;
    @Order(64)
    private Long key0;
    @Order(65)
    private Integer unknown88;
    @Order(66)
    private Integer unknown89;
    @Order(67)
    private List<Long> keys0;
    @Order(68)
    private List<Long> keys1;
    @Order(69)
    private Integer unknown94;
    @Order(70)
    private String sinkAnimation_AOFile;
    @Order(71)
    private Byte flag2;
    @Order(72)
    private List<Long> keys2;
    @Order(73)
    private Byte flag3;
    @Order(74)
    private Byte flag4;
    @Order(75)
    private Byte flag5;

}
