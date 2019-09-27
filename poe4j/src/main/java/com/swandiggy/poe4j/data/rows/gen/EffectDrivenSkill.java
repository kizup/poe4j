
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("EffectDrivenSkill")
public class EffectDrivenSkill
    extends BaseRow
{

    @Order(0)
    private Integer unknown0;
    @Order(1)
    private List<Long> unknown1;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private Integer unknown5;
    @Order(6)
    private Byte flag0;
    @Order(7)
    private Byte flag1;
    @Order(8)
    private Integer unknown6;
    @Order(9)
    private Byte flag2;
    @Order(10)
    private Integer unknown7;
    @Order(11)
    private Integer unknown8;
    @Order(12)
    private Integer unknown9;
    @Order(13)
    private Integer unknown10;
    @Order(14)
    private Integer unknown11;
    @Order(15)
    private Integer unknown12;
    @Order(16)
    private Byte flag3;
    @Order(17)
    private Integer unknown13;
    @Order(18)
    private Byte flag4;
    @Order(19)
    private Byte flag5;
    @Order(20)
    private Integer unknown14;
    @Order(21)
    private Integer unknown15;
    @Order(22)
    private Byte flag6;
    @Order(23)
    private Byte flag7;

}
