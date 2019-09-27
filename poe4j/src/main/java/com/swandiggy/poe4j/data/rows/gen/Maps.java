
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Maps")
public class Maps
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private WorldAreas regular_WorldAreasKey;
    @Order(2)
    private WorldAreas unique_WorldAreasKey;
    @Order(3)
    private BaseItemTypes mapUpgrade_BaseItemTypesKey;
    @Order(4)
    private List<MonsterPacks> monsterPacksKeys;
    @Order(5)
    private Long key2;
    @Order(6)
    private String regular_GuildCharacter;
    @Order(7)
    private String unique_GuildCharacter;
    @Order(8)
    private Integer tier;
    @Order(9)
    @Reference(Integer.class)
    private Maps shaped_Base_MapsKey;
    @Order(10)
    private Integer shaped_AreaLevel;
    @Order(11)
    @Reference(Integer.class)
    private Maps upgradedFrom_MapsKey;
    @Order(12)
    @Reference(Integer.class)
    private Maps mapsKey2;
    @Order(13)
    @Reference(Integer.class)
    private Maps mapsKey3;
    @Order(14)
    @Reference(Integer.class)
    private MapSerie mapSeriesKey;
    @Order(15)
    private Boolean flag0;

}
