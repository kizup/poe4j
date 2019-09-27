
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MapPins")
public class MapPins
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer positionX;
    @Order(2)
    private Integer positionY;
    @Order(3)
    private WorldAreas waypoint_WorldAreasKey;
    @Order(4)
    private List<WorldAreas> worldAreasKeys;
    @Order(5)
    private String name;
    @Order(6)
    private String flavourText;
    @Order(7)
    private List<Integer> data1;
    @Order(8)
    private Integer act;
    @Order(9)
    private String unknownId;
    @Order(10)
    private List<Integer> data0;
    @Order(11)
    private Integer unknown13;

}
