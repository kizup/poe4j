
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ItemVisualIdentity")
public class ItemVisualIdentity
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String dDSFile;
    @Order(2)
    private String aOFile;
    @Order(3)
    private SoundEffects soundEffectsKey;
    @Order(4)
    private Integer unknownUniqueInt;
    @Order(5)
    private String aOFile2;
    @Order(6)
    private List<String> marauderSMFiles;
    @Order(7)
    private List<String> rangerSMFiles;
    @Order(8)
    private List<String> witchSMFiles;
    @Order(9)
    private List<String> duelistDexSMFiles;
    @Order(10)
    private List<String> templarSMFiles;
    @Order(11)
    private List<String> shadowSMFiles;
    @Order(12)
    private List<String> scionSMFiles;
    @Order(13)
    private String marauderShape;
    @Order(14)
    private String rangerShape;
    @Order(15)
    private String witchShape;
    @Order(16)
    private String duelistShape;
    @Order(17)
    private String templarShape;
    @Order(18)
    private String shadowShape;
    @Order(19)
    private String scionShape;
    @Order(20)
    private Integer unknown0;
    @Order(21)
    private Integer unknown1;
    @Order(22)
    private List<AchievementItems> pickup_AchievementItemsKeys;
    @Order(23)
    private List<String> sMFiles;
    @Order(24)
    private List<AchievementItems> identify_AchievementItemsKeys;
    @Order(25)
    private String ePKFile;
    @Order(26)
    private List<AchievementItems> corrupt_AchievementItemsKeys;
    @Order(27)
    private Boolean isAlternateArt;
    @Order(28)
    private Boolean flag2;
    @Order(29)
    private AchievementItems createCorruptedJewelAchievementItemsKey;
    @Order(30)
    private String animationLocation;
    @Order(31)
    private Integer unknown2;
    @Order(32)
    private Integer unknown3;
    @Order(33)
    private Integer unknown4;
    @Order(34)
    private Integer unknown5;
    @Order(35)
    private Integer unknown6;
    @Order(36)
    private Integer unknown7;
    @Order(37)
    private Integer unknown8;
    @Order(38)
    private Integer unknown9;
    @Order(39)
    private Integer unknown10;
    @Order(40)
    private Integer unknown11;
    @Order(41)
    private Integer unknown12;
    @Order(42)
    private Integer unknown13;
    @Order(43)
    private Boolean isAtlasOfWorldsMapIcon;
    @Order(44)
    private Boolean isTier16Icon;
    @Order(45)
    private Integer unknown14;
    @Order(46)
    private Integer unknown15;

}
