
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BestiaryRecipeComponent")
public class BestiaryRecipeComponent
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer minLevel;
    @Order(2)
    private BestiaryFamilie bestiaryFamiliesKey;
    @Order(3)
    private BestiaryGroups bestiaryGroupsKey;
    @Order(4)
    private Mods modsKey;
    @Order(5)
    private BestiaryCapturableMonster bestiaryCapturableMonstersKey;
    @Order(6)
    private Integer rarityKey;
    @Order(7)
    private BestiaryGenus bestiaryGenusKey;

}
