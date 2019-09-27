
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BestiaryNets")
public class BestiaryNet
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private Integer unknown0;
    @Order(2)
    private Integer captureMinLevel;
    @Order(3)
    private Integer captureMaxLevel;
    @Order(4)
    private Integer dropMinLevel;
    @Order(5)
    private Integer dropMaxLevel;
    @Order(6)
    private Integer unknown1;
    @Order(7)
    private Boolean isEnabled;

}
