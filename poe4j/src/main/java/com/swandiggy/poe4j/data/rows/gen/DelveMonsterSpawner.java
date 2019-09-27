
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DelveMonsterSpawners")
public class DelveMonsterSpawner
    extends BaseRow
{

    @Order(0)
    private String baseMetadata;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private List<Long> unknown2;
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
    private Integer unknown10;
    @Order(10)
    private Integer unknown11;
    @Order(11)
    private Byte flag0;
    @Order(12)
    private Byte flag1;
    @Order(13)
    private Byte flag2;
    @Order(14)
    private Byte flag3;
    @Order(15)
    private Byte flag4;
    @Order(16)
    private Byte flag5;
    @Order(17)
    private Byte flag6;
    @Order(18)
    private Byte flag7;
    @Order(19)
    private Byte flag8;
    @Order(20)
    private Byte flag9;
    @Order(21)
    private Integer unknown14;
    @Order(22)
    private Integer unknown15;
    @Order(23)
    private Integer unknown16;
    @Order(24)
    private Integer unknown17;
    @Order(25)
    private Integer unknown18;
    @Order(26)
    private Byte flag10;
    @Order(27)
    private Byte flag11;
    @Order(28)
    private Integer unknown19;
    @Order(29)
    private String script;
    @Order(30)
    private Byte flag12;

}
