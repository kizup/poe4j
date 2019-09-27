
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Labyrinths")
public class Labyrinth
    extends BaseRow
{

    @Order(0)
    private Integer tier;
    @Order(1)
    private String name;
    @Order(2)
    private Long key0;
    @Order(3)
    private Integer questState;
    @Order(4)
    private List<Long> keys0;
    @Order(5)
    private Integer areaLevel;
    @Order(6)
    private Integer unknown1;
    @Order(7)
    private Long key1;
    @Order(8)
    private List<Integer> data0;
    @Order(9)
    private List<Integer> data1;
    @Order(10)
    private Integer minLevel;

}
