
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("GeometryAttack")
public class GeometryAttack
    extends BaseRow
{

    @Order(0)
    private Integer unknown0;
    @Order(1)
    private List<Long> keys0;
    @Order(2)
    private List<Long> keys1;
    @Order(3)
    private Integer unknown5;
    @Order(4)
    private Integer unknown6;
    @Order(5)
    private Integer unknown7;
    @Order(6)
    private Integer unknown8;
    @Order(7)
    private Integer unknown9;
    @Order(8)
    private Boolean flag1;
    @Order(9)
    private Integer unknown10;
    @Order(10)
    private Integer unknown11;
    @Order(11)
    private Integer unknown12;
    @Order(12)
    private Boolean flag2;
    @Order(13)
    private Boolean flag3;
    @Order(14)
    private Integer unknown13;
    @Order(15)
    private Integer unknown14;
    @Order(16)
    private Integer unknown15;
    @Order(17)
    private Integer unknown16;
    @Order(18)
    private Long key0;
    @Order(19)
    private Integer unknown18;
    @Order(20)
    private Integer unknown19;
    @Order(21)
    private Boolean flag4;
    @Order(22)
    private Boolean flag5;
    @Order(23)
    private Integer unknown21;
    @Order(24)
    private Integer unknown22;
    @Order(25)
    private Boolean flag6;
    @Order(26)
    private Integer unknown23;
    @Order(27)
    private Boolean flag7;
    @Order(28)
    private Long key1;
    @Order(29)
    private List<Integer> unknown25;
    @Order(30)
    private Integer unknown26;

}
