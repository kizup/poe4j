
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterDeathConditions")
public class MonsterDeathConditions
    extends BaseRow
{

    @Order(0)
    private String unknown0;
    @Order(1)
    private List<Long> unknown1;
    @Order(2)
    private Byte flag0;
    @Order(3)
    private Integer unknown2;
    @Order(4)
    private List<Long> unknown3;
    @Order(5)
    private Byte flag1;
    @Order(6)
    private Integer unknown4;
    @Order(7)
    private Integer unknown5;
    @Order(8)
    private Long unknown6;
    @Order(9)
    private Integer unknown7;
    @Order(10)
    private Byte flag3;
    @Order(11)
    private List<Long> unknown8;
    @Order(12)
    private Integer unknown9;
    @Order(13)
    private Long unknown10;
    @Order(14)
    private Long unknown11;

}
