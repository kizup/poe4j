
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AtlasPositions")
public class AtlasPosition
    extends BaseRow
{

    @Order(0)
    private Integer unknown0;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private Float unknown2;
    @Order(3)
    private Float unknown3;

}
