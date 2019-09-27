
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SafehouseBYOCrafting")
public class SafehouseBYOCrafting
    extends BaseRow
{

    @Order(0)
    private BetrayalJob betrayalJobsKey;
    @Order(1)
    private BetrayalTargets betrayalTargetsKey;
    @Order(2)
    private BetrayalRank betrayalRanksKey;
    @Order(3)
    private String description;
    @Order(4)
    private String serverCommand;

}
