
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ExecuteGEAL")
public class ExecuteGEAL
    extends BaseRow
{

    @Order(0)
    private Integer unknown0;
    @Order(1)
    private List<Long> keys0;
    @Order(2)
    private Integer unknown3;
    @Order(3)
    private Integer unknown4;
    @Order(4)
    private Integer unknown5;
    @Order(5)
    private Integer unknown6;
    @Order(6)
    private Integer unknown7;
    @Order(7)
    private Integer unknown8;
    @Order(8)
    private Integer unknown9;
    @Order(9)
    private Boolean flag0;
    @Order(10)
    private Integer unknown10;
    @Order(11)
    private Boolean flag1;
    @Order(12)
    private Integer unknown11;
    @Order(13)
    private Boolean flag2;
    @Order(14)
    private Integer unknown12;
    @Order(15)
    private Integer unknown13;
    @Order(16)
    private Integer unknown14;
    @Order(17)
    private Integer unknown15;
    @Order(18)
    private Integer unknown16;
    @Order(19)
    private Integer unknown17;
    @Order(20)
    private Boolean flag3;
    @Order(21)
    private Integer unknown18;
    @Order(22)
    private Boolean flag4;
    @Order(23)
    private Integer unknown19;
    @Order(24)
    private Boolean flag5;
    @Order(25)
    private Integer unknown22;
    @Order(26)
    private Integer unknown20;
    @Order(27)
    private Boolean flag6;
    @Order(28)
    private Integer unknown23;
    @Order(29)
    private List<String> metadataIDs;
    @Order(30)
    private String scriptCommand;
    @Order(31)
    private Integer unknown28;
    @Order(32)
    private Integer unknown29;
    @Order(33)
    private Integer unknown30;
    @Order(34)
    private Integer unknown31;
    @Order(35)
    private Integer unknown32;

}
