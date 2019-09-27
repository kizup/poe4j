
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SkillSurgeEffects")
public class SkillSurgeEffect
    extends BaseRow
{

    @Order(0)
    private GrantedEffect grantedEffectsKey;
    @Order(1)
    private String unknown0;
    @Order(2)
    private Boolean flag0;
    @Order(3)
    private Boolean flag1;
    @Order(4)
    private Boolean flag2;
    @Order(5)
    private MiscAnimated miscAnimated;

}
