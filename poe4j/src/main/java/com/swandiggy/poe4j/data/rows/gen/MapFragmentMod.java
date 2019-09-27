
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MapFragmentMods")
public class MapFragmentMod
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private List<Mods> modsKey;
    @Order(2)
    private AchievementItems achievementItemsKey;
    @Order(3)
    private Integer mapFragmentFamilies;
    @Order(4)
    private Boolean flag0;
    @Order(5)
    private Boolean flag1;
    @Order(6)
    private Boolean flag2;
    @Order(7)
    private Boolean flag3;

}
