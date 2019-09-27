
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("GeometryProjectiles")
public class GeometryProjectile
    extends BaseRow
{

    @Order(0)
    private Integer unknown0;
    @Order(1)
    private Long key0;
    @Order(2)
    private Boolean flag0;
    @Order(3)
    private Integer unknown2;
    @Order(4)
    private Boolean flag1;
    @Order(5)
    private Integer unknown3;
    @Order(6)
    private Integer unknown4;
    @Order(7)
    private Boolean flag2;
    @Order(8)
    private Integer unknown5;
    @Order(9)
    private Integer unknown6;
    @Order(10)
    private Integer unknown7;
    @Order(11)
    private Boolean flag3;
    @Order(12)
    private Integer unknown8;
    @Order(13)
    private Integer unknown9;

}
