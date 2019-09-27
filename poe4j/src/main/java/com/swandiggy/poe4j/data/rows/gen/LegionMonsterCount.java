
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LegionMonsterCounts")
public class LegionMonsterCount
    extends BaseRow
{

    @Order(0)
    private LegionFactions legionFactionsKey;
    @Order(1)
    private LegionRanks legionRanksKey;
    @Order(2)
    private Integer unknown0;
    @Order(3)
    private Integer unknown1;
    @Order(4)
    private Integer unknown2;
    @Order(5)
    private Integer unknown3;
    @Order(6)
    private Integer unknown4;
    @Order(7)
    private Integer unknown5;

}
