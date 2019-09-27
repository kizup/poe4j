
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("FragmentStashTabLayout")
public class FragmentStashTabLayout
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private BaseItemTypes baseItemTypesKey;
    @Order(2)
    private Integer posX;
    @Order(3)
    private Integer posY;
    @Order(4)
    private Integer order;
    @Order(5)
    private Integer sizeX;
    @Order(6)
    private Integer sizeY;
    @Order(7)
    private Byte unknown0;

}
