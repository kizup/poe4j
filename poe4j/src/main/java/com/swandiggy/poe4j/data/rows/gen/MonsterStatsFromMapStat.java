
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterStatsFromMapStats")
public class MonsterStatsFromMapStat
    extends BaseRow
{

    @Order(0)
    private Stats statsKey;
    @Order(1)
    private List<Long> keys0;
    @Order(2)
    private List<Long> keys1;
    @Order(3)
    private List<Stats> statsKeys;
    @Order(4)
    private Long key0;
    @Order(5)
    private List<Long> keys2;
    @Order(6)
    private Integer unknown0;
    @Order(7)
    private Byte unknown13;
    @Order(8)
    private Integer unknown1;

}
