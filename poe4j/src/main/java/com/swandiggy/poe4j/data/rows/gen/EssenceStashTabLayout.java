
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("EssenceStashTabLayout")
public class EssenceStashTabLayout
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private BaseItemTypes baseItemTypesKey;
    @Order(2)
    private Integer x;
    @Order(3)
    private Integer y;
    @Order(4)
    private Integer intId;
    @Order(5)
    private Integer slotWidth;
    @Order(6)
    private Integer slotHeight;
    @Order(7)
    private Boolean isUpgradableEssenceSlot;

}
