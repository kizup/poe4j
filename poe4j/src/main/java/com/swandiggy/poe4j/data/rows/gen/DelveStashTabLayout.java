
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DelveStashTabLayout")
public class DelveStashTabLayout
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private BaseItemTypes baseItemTypesKey;
    @Order(2)
    private Integer x;
    @Order(3)
    private Integer y;
    @Order(4)
    private Integer intId;
    @Order(5)
    private Integer width;
    @Order(6)
    private Integer height;
    @Order(7)
    private Integer stackSize;

}
