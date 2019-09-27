
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("PathOfEndurance")
public class PathOfEndurance
    extends BaseRow
{

    @Order(0)
    private Integer unknown0;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private List<Mods> modsKeys;
    @Order(4)
    private Integer unknown5;
    @Order(5)
    private Integer unknown6;
    @Order(6)
    private List<Long> keys0;
    @Order(7)
    private List<Integer> data0;

}
