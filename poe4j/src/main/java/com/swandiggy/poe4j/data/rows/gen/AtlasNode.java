
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AtlasNode")
public class AtlasNode
    extends BaseRow
{

    @Order(0)
    private WorldAreas worldAreasKey;
    @Order(1)
    private Float x;
    @Order(2)
    private Float y;
    @Order(3)
    private Integer unknown0;
    @Order(4)
    private Integer unknown1;
    @Order(5)
    private Integer unknown2;
    @Order(6)
    private List<AtlasNode> atlasNodeKeys;
    @Order(7)
    private ItemVisualIdentity itemVisualIdentityKey;
    @Order(8)
    private Boolean flag0;
    @Order(9)
    private Integer tier;
    @Order(10)
    private Maps mapsKey;
    @Order(11)
    private Integer unknown4;
    @Order(12)
    private List<AtlasSector> atlasSectorKeys;
    @Order(13)
    private FlavourText flavourTextKey;

}
