
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AddBuffToTargetVarieties")
public class AddBuffToTargetVarietie
    extends BaseRow
{

    @Order(0)
    private Long unknown0;
    @Order(1)
    private List<Integer> unknown1;
    @Order(2)
    private List<Stats> statsKeys;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private List<Integer> unknown4;
    @Order(5)
    private Integer unknown5;

}
