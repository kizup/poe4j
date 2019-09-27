
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BlightTowersPerLevel")
public class BlightTowersPerLevel
    extends BaseRow
{

    @Order(0)
    private BlightTower blightTowersKey;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private MonsterVarieties monsterVarietiesKey;
    @Order(3)
    private Integer cost;
    @Order(4)
    private Integer unknown4;

}
