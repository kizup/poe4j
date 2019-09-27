
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StrDexIntMissionExtraRequirement")
public class StrDexIntMissionExtraRequirement
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer spawnWeight;
    @Order(2)
    private Integer minLevel;
    @Order(3)
    private Integer maxLevel;
    @Order(4)
    private Integer timeLimit;
    @Order(5)
    private Boolean hasTimeBonusPerKill;
    @Order(6)
    private Boolean hasTimeBonusPerObjectTagged;
    @Order(7)
    private Boolean hasLimitedPortals;
    @Order(8)
    private NPCTalk nPCTalkKey;
    @Order(9)
    private Integer timeLimitBonusFromObjective;
    @Order(10)
    private Integer objectCount;
    @Order(11)
    private List<Integer> data0;
    @Order(12)
    private Boolean flag0;
    @Order(13)
    private List<Long> keys0;
    @Order(14)
    private Byte flag1;
    @Order(15)
    private Byte flag2;

}
