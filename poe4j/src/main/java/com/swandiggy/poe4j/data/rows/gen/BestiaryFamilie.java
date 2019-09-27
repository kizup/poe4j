
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BestiaryFamilies")
public class BestiaryFamilie
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private String icon;
    @Order(3)
    private String iconSmall;
    @Order(4)
    private String illustration;
    @Order(5)
    private String pageArt;
    @Order(6)
    private String flavourText;
    @Order(7)
    private Boolean flag0;
    @Order(8)
    private Long key0;
    @Order(9)
    private Integer unknown9;

}
