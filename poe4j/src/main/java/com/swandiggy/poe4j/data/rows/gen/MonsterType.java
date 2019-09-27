
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterTypes")
public class MonsterType
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private Boolean isSummoned;
    @Order(3)
    private Integer armour;
    @Order(4)
    private Integer evasion;
    @Order(5)
    private Integer energyShieldFromLife;
    @Order(6)
    private Integer damageSpread;
    @Order(7)
    private List<Tags> tagsKeys;
    @Order(8)
    private MonsterResistance monsterResistancesKey;
    @Order(9)
    private Boolean isLargeAbyssMonster;
    @Order(10)
    private Boolean isSmallAbyssMonster;

}
