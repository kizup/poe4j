
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("WorldAreas")
public class WorldAreas
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private Integer act;
    @Order(3)
    private Boolean isTown;
    @Order(4)
    private Boolean hasWaypoint;
    @Order(5)
    private List<WorldAreas> connections_WorldAreasKeys;
    @Order(6)
    private Integer areaLevel;
    @Order(7)
    private Integer unknown6;
    @Order(8)
    private Integer unknown7;
    @Order(9)
    private Integer unknown8;
    @Order(10)
    private String loadingScreen_DDSFile;
    @Order(11)
    private Integer unknown10;
    @Order(12)
    private List<Integer> data0;
    @Order(13)
    private Integer unknown13;
    @Order(14)
    private List<Topologies> topologiesKeys;
    @Order(15)
    private WorldAreas parentTown_WorldAreasKey;
    @Order(16)
    private Integer unknown17;
    @Order(17)
    private Integer unknown18;
    @Order(18)
    private Integer unknown19;
    @Order(19)
    private List<MonsterVarieties> bosses_MonsterVarietiesKeys;
    @Order(20)
    private List<MonsterVarieties> monsters_MonsterVarietiesKeys;
    @Order(21)
    private List<Tags> spawnWeight_TagsKeys;
    @Order(22)
    private List<Integer> spawnWeight_Values;
    @Order(23)
    private Boolean isMapArea;
    @Order(24)
    private List<AchievementItems> fullClear_AchievementItemsKeys;
    @Order(25)
    private Integer unknown32;
    @Order(26)
    private Integer unknown33;
    @Order(27)
    private AchievementItems achievementItemsKey;
    @Order(28)
    private List<Mods> modsKeys;
    @Order(29)
    private Integer unknown38;
    @Order(30)
    private Integer unknown39;
    @Order(31)
    private List<WorldAreas> vaalArea_WorldAreasKeys;
    @Order(32)
    private Integer vaalArea_SpawnChance;
    @Order(33)
    private Integer strongbox_SpawnChance;
    @Order(34)
    private Integer strongbox_MaxCount;
    @Order(35)
    private List<Integer> strongbox_RarityWeight;
    @Order(36)
    private Byte flag0;
    @Order(37)
    private Integer unknown46;
    @Order(38)
    private Integer maxLevel;
    @Order(39)
    private List<Tags> areaType_TagsKeys;
    @Order(40)
    private Integer unknown50;
    @Order(41)
    private Integer unknown51;
    @Order(42)
    private Boolean isHideout;
    @Order(43)
    private Integer unknown52;
    @Order(44)
    private Integer unknown53;
    @Order(45)
    private Integer unknown54;
    @Order(46)
    private Integer unknown55;
    @Order(47)
    private Integer unknown56;
    @Order(48)
    private Integer unknown57;
    @Order(49)
    private Integer unknown58;
    @Order(50)
    private Integer unknown59;
    @Order(51)
    private List<Tags> tagsKeys;
    @Order(52)
    private Boolean isVaalArea;
    @Order(53)
    private Integer unknown62;
    @Order(54)
    private Integer unknown63;
    @Order(55)
    private Integer unknown64;
    @Order(56)
    private Boolean isLabyrinthAirlock;
    @Order(57)
    private Boolean isLabyrinthArea;
    @Order(58)
    private AchievementItems twinnedFullClear_AchievementItemsKey;
    @Order(59)
    private AchievementItems enter_AchievementItemsKey;
    @Order(60)
    private Integer unknown69;
    @Order(61)
    private Integer unknown70;
    @Order(62)
    private Integer unknown71;
    @Order(63)
    private String tSIFile;
    @Order(64)
    private Long key0;
    @Order(65)
    private Integer unknown75;
    @Order(66)
    private Integer unknown76;
    @Order(67)
    private Integer unknown77;
    @Order(68)
    private List<AchievementItems> waypointActivation_AchievementItemsKeys;
    @Order(69)
    private Boolean isUniqueMapArea;
    @Order(70)
    private Boolean isLabyrinthBossArea;
    @Order(71)
    private Integer unknown80;
    @Order(72)
    private Integer unknown81;
    @Order(73)
    private NPCTextAudio firstEntry_NPCTextAudioKey;
    @Order(74)
    private SoundEffects firstEntry_SoundEffectsKey;
    @Order(75)
    private NPCs firstEntry_NPCsKey;
    @Order(76)
    private Integer unknown87;
    @Order(77)
    private Integer unknown88;
    @Order(78)
    private Integer unknown89;
    @Order(79)
    private Integer unknown90;
    @Order(80)
    private Integer unknown91;
    @Order(81)
    private Integer unknown94;
    @Order(82)
    private Environment environmentsKey;
    @Order(83)
    private Integer unknown85;
    @Order(84)
    private Integer unknown86;
    @Order(85)
    private Integer unknown92;
    @Order(86)
    private Integer unknown93;
    @Order(87)
    private Integer unknown95;
    @Order(88)
    private Integer unknown96;
    @Order(89)
    private Integer unknown97;
    @Order(90)
    private Integer unknown98;
    @Order(91)
    private Integer unknown99;
    @Order(92)
    private Integer unknown100;
    @Order(93)
    private Integer unknown101;
    @Order(94)
    private Integer unknown102;
    @Order(95)
    private Boolean flag1;
    @Order(96)
    private Integer unknown103;
    @Order(97)
    private Integer unknown104;
    @Order(98)
    private Byte flag2;
    @Order(99)
    private Integer unknown105;
    @Order(100)
    private Integer unknown106;
    @Order(101)
    private Integer unknown107;
    @Order(102)
    private Integer unknown108;
    @Order(103)
    private Integer unknown109;

}
