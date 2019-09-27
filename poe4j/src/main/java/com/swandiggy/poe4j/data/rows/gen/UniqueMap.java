
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("UniqueMaps")
public class UniqueMap
    extends BaseRow
{

    @Order(0)
    private ItemVisualIdentity itemVisualIdentityKey;
    @Order(1)
    private WorldAreas worldAreasKey;
    @Order(2)
    private Words wordsKey;
    @Order(3)
    private FlavourText flavourTextKey;
    @Order(4)
    private Boolean hasGuildCharacter;
    @Order(5)
    private String guildCharacter;
    @Order(6)
    private String name;

}
