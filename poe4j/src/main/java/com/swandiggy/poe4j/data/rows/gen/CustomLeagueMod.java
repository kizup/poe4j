
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("CustomLeagueMods")
public class CustomLeagueMod
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Long> keys0;
    @Order(2)
    private List<Integer> data0;
    @Order(3)
    private Boolean flag0;
    @Order(4)
    private Boolean flag1;
    @Order(5)
    private Integer unknown0;
    @Order(6)
    private Long key0;
    @Order(7)
    private Integer unknown1;
    @Order(8)
    private Long key1;
    @Order(9)
    private Integer unknown2;

}
