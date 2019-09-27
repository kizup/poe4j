
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("FixedMissions")
public class FixedMission
    extends BaseRow
{

    @Order(0)
    private Long key0;
    @Order(1)
    private Long key1;
    @Order(2)
    private Integer unknown4;
    @Order(3)
    private Integer unknown5;
    @Order(4)
    private Integer unknown6;
    @Order(5)
    private Integer unknown7;
    @Order(6)
    private Integer unknown8;
    @Order(7)
    private Integer unknown9;

}
