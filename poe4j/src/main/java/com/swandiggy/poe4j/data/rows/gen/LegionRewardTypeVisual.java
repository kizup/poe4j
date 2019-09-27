
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LegionRewardTypeVisuals")
public class LegionRewardTypeVisual
    extends BaseRow
{

    @Order(0)
    private Integer intId;
    @Order(1)
    private Long key0;
    @Order(2)
    private String unknown1;
    @Order(3)
    private MiscAnimated miscAnimatedKey;
    @Order(4)
    private Float unknown2;
    @Order(5)
    private String id;

}
