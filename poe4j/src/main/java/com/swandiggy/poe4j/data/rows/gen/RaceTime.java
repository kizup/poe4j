
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("RaceTimes")
public class RaceTime
    extends BaseRow
{

    @Order(0)
    private Races racesKey;
    @Order(1)
    private Integer index;
    @Order(2)
    private Integer startUNIXTime;
    @Order(3)
    private Integer endUNIXTime;

}
