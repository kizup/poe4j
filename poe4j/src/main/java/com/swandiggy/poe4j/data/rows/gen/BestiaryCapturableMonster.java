
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BestiaryCapturableMonsters")
public class BestiaryCapturableMonster
    extends BaseRow
{

    @Order(0)
    private MonsterVarieties monsterVarietiesKey;
    @Order(1)
    private BestiaryGroups bestiaryGroupsKey;
    @Order(2)
    private String name;
    @Order(3)
    private Long key0;
    @Order(4)
    private Boolean flag0;
    @Order(5)
    private String iconSmall;
    @Order(6)
    private String icon;
    @Order(7)
    private MonsterVarieties boss_MonsterVarietiesKey;
    @Order(8)
    private BestiaryGenus bestiaryGenusKey;
    @Order(9)
    private Boolean flag1;
    @Order(10)
    @Reference(Integer.class)
    private BestiaryCapturableMonster bestiaryCapturableMonstersKey;
    @Order(11)
    private Boolean flag2;
    @Order(12)
    private Integer unknown0;
    @Order(13)
    private Boolean flag3;

}
