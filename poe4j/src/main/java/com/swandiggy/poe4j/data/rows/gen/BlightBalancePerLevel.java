
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BlightBalancePerLevel")
public class BlightBalancePerLevel
    extends BaseRow
{

    @Order(0)
    private Integer level;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private Integer unknown5;
    @Order(6)
    private Integer unknown6;
    @Order(7)
    private Integer unknown7;
    @Order(8)
    private Integer unknown8;
    @Order(9)
    private Integer unknown9;

}
