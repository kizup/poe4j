
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BlightedSporeAuras")
public class BlightedSporeAura
    extends BaseRow
{

    @Order(0)
    private Long key0;
    @Order(1)
    private List<Integer> unknown1;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private List<Integer> unknown4;
    @Order(4)
    private Integer unknown5;

}
