
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MeleeTrails")
public class MeleeTrails
    extends BaseRow
{

    @Order(0)
    private String ePKFile1;
    @Order(1)
    private String ePKFile2;
    @Order(2)
    private Integer unknown0;
    @Order(3)
    private Integer unknown1;
    @Order(4)
    private Integer unknown2;
    @Order(5)
    private Boolean flag0;
    @Order(6)
    private String aOFile;

}
