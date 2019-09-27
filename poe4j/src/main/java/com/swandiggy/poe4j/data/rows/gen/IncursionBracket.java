
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("IncursionBrackets")
public class IncursionBracket
    extends BaseRow
{

    @Order(0)
    private Integer minLevel;
    @Order(1)
    private WorldAreas incursion_WorldAreasKey;
    @Order(2)
    private WorldAreas template_WorldAreasKey;
    @Order(3)
    private List<Float> data0;
    @Order(4)
    private Float unknown0;
    @Order(5)
    private Integer unknown1;

}
