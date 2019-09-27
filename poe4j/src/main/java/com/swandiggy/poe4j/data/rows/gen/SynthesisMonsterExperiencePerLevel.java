
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SynthesisMonsterExperiencePerLevel")
public class SynthesisMonsterExperiencePerLevel
    extends BaseRow
{

    @Order(0)
    private Integer level;
    @Order(1)
    private Integer experienceBonus;

}
