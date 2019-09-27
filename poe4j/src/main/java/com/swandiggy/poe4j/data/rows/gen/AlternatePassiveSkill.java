
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AlternatePassiveSkills")
public class AlternatePassiveSkill
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private AlternateTreeVersions alternateTreeVersionsKey;
    @Order(2)
    private String name;
    @Order(3)
    private List<Integer> passiveType;
    @Order(4)
    private List<Stats> statsKeys;
    @Order(5)
    private Integer stat1Min;
    @Order(6)
    private Integer stat1Max;
    @Order(7)
    private Integer stat2Min;
    @Order(8)
    private Integer stat2Max;
    @Order(9)
    private Integer unknown9;
    @Order(10)
    private Integer unknown10;
    @Order(11)
    private Integer unknown11;
    @Order(12)
    private Integer unknown12;
    @Order(13)
    private Integer unknown13;
    @Order(14)
    private Integer unknown14;
    @Order(15)
    private Integer unknown15;
    @Order(16)
    private Integer unknown16;
    @Order(17)
    private Integer spawnWeight;
    @Order(18)
    private Integer unknown18;
    @Order(19)
    private Integer randomMin;
    @Order(20)
    private Integer randomMax;
    @Order(21)
    private String flavourText;
    @Order(22)
    private String dDSIcon;
    @Order(23)
    private List<AchievementItems> achievementItemsKeys;

}
