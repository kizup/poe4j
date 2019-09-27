
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("IncursionRoomBossFightEvents")
public class IncursionRoomBossFightEvent
    extends BaseRow
{

    @Order(0)
    private Integer unknown0;
    @Order(1)
    private List<Integer> data0;
    @Order(2)
    private String unknown3;
    @Order(3)
    private String unknown4;
    @Order(4)
    private String unknown5;
    @Order(5)
    private String unknown6;
    @Order(6)
    private Long key0;

}
