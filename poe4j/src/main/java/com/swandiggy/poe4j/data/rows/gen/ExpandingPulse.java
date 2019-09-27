
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ExpandingPulse")
public class ExpandingPulse
    extends BaseRow
{

    @Order(0)
    private List<Integer> unknown0;
    @Order(1)
    private List<Integer> unknown1;
    @Order(2)
    private List<Float> unknown2;
    @Order(3)
    private List<Long> keys0;
    @Order(4)
    private Long key0;
    @Order(5)
    private Boolean flag0;

}
