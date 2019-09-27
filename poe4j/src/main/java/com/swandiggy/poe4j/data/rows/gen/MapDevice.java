
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MapDevices")
public class MapDevice
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Long key0;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private Byte flag0;
    @Order(4)
    private String inheritsFrom;
    @Order(5)
    private String command;
    @Order(6)
    private List<Integer> command_Data;

}
