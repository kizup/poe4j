
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("UniqueStashTypes")
public class UniqueStashTypes
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer order;
    @Order(2)
    private Integer width;
    @Order(3)
    private Integer height;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private Integer unknown5;
    @Order(6)
    private String name;
    @Order(7)
    private Integer unknown7;
    @Order(8)
    private String image;
    @Order(9)
    private Integer unknown9;

}
