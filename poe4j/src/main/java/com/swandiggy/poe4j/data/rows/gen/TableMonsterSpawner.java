
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("TableMonsterSpawners")
public class TableMonsterSpawner
    extends BaseRow
{

    @Order(0)
    private String metadata;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private List<Long> unknown2;
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
    private Byte flag0;
    @Order(12)
    private Integer unknown11;
    @Order(13)
    private Integer unknown12;
    @Order(14)
    private Byte flag1;
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
    private Byte flag3;
    @Order(21)
    private Byte flag4;
    @Order(22)
    private Integer unknown18;
    @Order(23)
    private String script1;
    @Order(24)
    private Byte flag5;
    @Order(25)
    private Byte flag6;
    @Order(26)
    private String script2;
    @Order(27)
    private List<Integer> data0;

}
