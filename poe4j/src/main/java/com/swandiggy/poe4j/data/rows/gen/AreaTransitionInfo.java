
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AreaTransitionInfo")
public class AreaTransitionInfo
    extends BaseRow
{

    @Order(0)
    private Long key0;
    @Order(1)
    private Long key1;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private Integer unknown5;
    @Order(6)
    private Long key2;
    @Order(7)
    private Long key3;
    @Order(8)
    private Long key4;
    @Order(9)
    private Long key5;
    @Order(10)
    private Long key6;
    @Order(11)
    private Long key7;
    @Order(12)
    private Long key8;
    @Order(13)
    private List<Long> keys0;
    @Order(14)
    private Integer unknown24;
    @Order(15)
    private List<Long> keys1;

}
