
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AtlasNodeDefinition")
public class AtlasNodeDefinition
    extends BaseRow
{

    @Order(0)
    private WorldAreas worldAreasKey;
    @Order(1)
    private ItemVisualIdentity itemVisualIdentityKey;
    @Order(2)
    private Boolean flag0;
    @Order(3)
    private Integer tier;
    @Order(4)
    private Integer unknown0;
    @Order(5)
    private Integer unknown1;

}
