
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ItemVisualHeldBodyModel")
public class ItemVisualHeldBodyModel
    extends BaseRow
{

    @Order(0)
    private Long key0;
    @Order(1)
    private String unknown1;
    @Order(2)
    private String unknown2;
    @Order(3)
    private String unknown3;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private Integer unknown5;
    @Order(6)
    private Integer unknown6;
    @Order(7)
    private String unknown7;
    @Order(8)
    private String unknown8;
    @Order(9)
    private String unknown9;
    @Order(10)
    private String unknown10;
    @Order(11)
    private String unknown11;
    @Order(12)
    private String unknown12;
    @Order(13)
    private String unknown13;
    @Order(14)
    private String unknown14;

}
