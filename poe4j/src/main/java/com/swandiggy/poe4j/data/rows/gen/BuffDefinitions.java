
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BuffDefinitions")
public class BuffDefinitions
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String description;
    @Order(2)
    private Boolean invisible;
    @Order(3)
    private Boolean removable;
    @Order(4)
    private String name;
    @Order(5)
    private List<Stats> statsKeys;
    @Order(6)
    private Boolean flag0;
    @Order(7)
    private Integer unknown0;
    @Order(8)
    private Boolean flag1;
    @Order(9)
    private Stats maximum_StatsKey;
    @Order(10)
    private Stats current_StatsKey;
    @Order(11)
    private Boolean flag2;
    @Order(12)
    private Integer unknown1;
    @Order(13)
    private BuffVisuals buffVisualsKey;
    @Order(14)
    private Boolean flag3;
    @Order(15)
    private Boolean flag4;
    @Order(16)
    private Integer unknown2;
    @Order(17)
    private Boolean flag5;
    @Order(18)
    private Boolean flag6;
    @Order(19)
    private Boolean flag7;
    @Order(20)
    private Boolean flag8;
    @Order(21)
    private Integer buffLimit;
    @Order(22)
    private Boolean flag10;
    @Order(23)
    private String id2;
    @Order(24)
    private Boolean isRecovery;
    @Order(25)
    private Boolean flag11;
    @Order(26)
    private Boolean flag12;
    @Order(27)
    private Long key0;
    @Order(28)
    private Byte flag13;
    @Order(29)
    private Integer unknown6;
    @Order(30)
    private Byte flag14;
    @Order(31)
    private Byte flag15;
    @Order(32)
    private Integer unknown7;
    @Order(33)
    private Integer unknown8;
    @Order(34)
    private String unknown9;
    @Order(35)
    private Boolean flag16;
    @Order(36)
    private Boolean flag17;

}
