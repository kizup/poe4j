
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BlightTopologyNodes")
public class BlightTopologyNode
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Integer> data1;
    @Order(2)
    private Integer size;
    @Order(3)
    private String type;
    @Order(4)
    private List<Integer> data3;
    @Order(5)
    private List<Integer> data4;
    @Order(6)
    private List<Integer> data5;
    @Order(7)
    private List<Integer> data6;
    @Order(8)
    private List<Integer> data7;
    @Order(9)
    private List<Integer> data8;

}
