
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Tutorial")
public class Tutorial
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String uIFile;
    @Order(2)
    private Long key0;
    @Order(3)
    private Boolean isEnabled;
    @Order(4)
    private Integer unknown0;
    @Order(5)
    private List<Integer> unknown1;
    @Order(6)
    private Integer unknown2;
    @Order(7)
    private Integer unknown3;
    @Order(8)
    private List<Integer> unknown4;
    @Order(9)
    private Boolean flag0;
    @Order(10)
    private Boolean flag1;

}
