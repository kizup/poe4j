
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NPCAudio")
public class NPCAudio
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Integer> data0;
    @Order(2)
    private List<Integer> data1;
    @Order(3)
    private Integer volumePercentage;
    @Order(4)
    private Integer unknown0;
    @Order(5)
    private Integer unknown1;
    @Order(6)
    private Integer unknown2;
    @Order(7)
    private Integer unknown3;

}
