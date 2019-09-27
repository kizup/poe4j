
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AbyssObjects")
public class AbyssObject
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private String metadataFile;
    @Order(6)
    private Integer unknown6;
    @Order(7)
    private List<Long> keys0;
    @Order(8)
    private Integer unknown9;
    @Order(9)
    private Integer unknown10;
    @Order(10)
    private Long key0;
    @Order(11)
    private Integer unknown12;
    @Order(12)
    private Integer unknown13;
    @Order(13)
    private Integer unknown14;
    @Order(14)
    private Integer unknown15;
    @Order(15)
    private Integer unknown16;
    @Order(16)
    private Integer unknown17;
    @Order(17)
    private Integer unknown18;
    @Order(18)
    private Integer unknown19;
    @Order(19)
    private Integer unknown20;

}
