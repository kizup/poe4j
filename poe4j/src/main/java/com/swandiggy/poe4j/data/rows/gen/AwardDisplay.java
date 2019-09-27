
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AwardDisplay")
public class AwardDisplay
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String text;
    @Order(2)
    private String backgroundImage;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private Float unknown4;
    @Order(5)
    private Float unknown5;
    @Order(6)
    private String unknown6;
    @Order(7)
    private String unknown7;
    @Order(8)
    private String foregroundImage;
    @Order(9)
    private String oGGFile;
    @Order(10)
    private Integer unknown8;

}
