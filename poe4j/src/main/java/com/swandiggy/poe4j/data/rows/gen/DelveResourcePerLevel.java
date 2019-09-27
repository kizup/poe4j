
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DelveResourcePerLevel")
public class DelveResourcePerLevel
    extends BaseRow
{

    @Order(0)
    private Integer areaLevel;
    @Order(1)
    private Integer sulphite;

}
