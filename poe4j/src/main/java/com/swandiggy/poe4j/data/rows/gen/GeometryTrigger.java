
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("GeometryTrigger")
public class GeometryTrigger
    extends BaseRow
{

    @Order(0)
    private Integer unknown0;
    @Order(1)
    private Long unknown1;
    @Order(2)
    private Long unknown2;
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
    @Order(10)
    private Integer unknown10;
    @Order(11)
    private Integer unknown11;
    @Order(12)
    private Integer unknown12;
    @Order(13)
    private Integer unknown13;
    @Order(14)
    private Integer unknown14;
    @Order(15)
    private Integer unknown15;
    @Order(16)
    private Integer unknown16;
    @Order(17)
    private Integer unknown17;
    @Order(18)
    private Byte flag0;
    @Order(19)
    private Integer unknown18;
    @Order(20)
    private Byte flag1;
    @Order(21)
    private Integer unknown19;
    @Order(22)
    private Byte flag2;
    @Order(23)
    private Integer unknown20;
    @Order(24)
    private Integer unknown21;
    @Order(25)
    private List<Long> keys;
    @Order(26)
    private Integer unknown23;
    @Order(27)
    private Byte flag3;

}
