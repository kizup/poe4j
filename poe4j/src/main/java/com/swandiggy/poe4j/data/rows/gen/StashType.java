
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("StashType")
public class StashType
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer intId;
    @Order(2)
    private String id2;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private Long key0;

}
