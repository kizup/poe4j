
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AdditionalMonsterPacksFromStats")
public class AdditionalMonsterPacksFromStat
    extends BaseRow
{

    @Order(0)
    private Stats statsKey;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private List<MonsterPacks> monsterPacksKeys;
    @Order(3)
    private Integer additionalMonsterPacksStatMode;
    @Order(4)
    private Stats packCountStatsKey;
    @Order(5)
    private List<Stats> statsKeys;
    @Order(6)
    private List<Integer> statsValues;
    @Order(7)
    private Integer unknown7;

}
