
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MapStatConditions")
public class MapStatConditions
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Stats statsKey;
    @Order(2)
    private Byte flag0;
    @Order(3)
    private Integer statMin;
    @Order(4)
    private Integer statMax;

}
