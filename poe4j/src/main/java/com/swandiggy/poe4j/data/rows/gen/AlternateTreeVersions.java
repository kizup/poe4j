
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AlternateTreeVersions")
public class AlternateTreeVersions
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Byte flag0;
    @Order(2)
    private Byte flag1;
    @Order(3)
    private Integer unknown1;
    @Order(4)
    private Integer unknown2;
    @Order(5)
    private Integer unknown3;
    @Order(6)
    private Integer unknown4;
    @Order(7)
    private Integer unknown5;
    @Order(8)
    private Integer unknown6;
    @Order(9)
    private Integer unknown7;

}
