
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SynthesisGlobalMods")
public class SynthesisGlobalMod
    extends BaseRow
{

    @Order(0)
    private Mods modsKey;
    @Order(1)
    private Integer weight;
    @Order(2)
    private Integer minLevel;
    @Order(3)
    private Integer maxLevel;

}
