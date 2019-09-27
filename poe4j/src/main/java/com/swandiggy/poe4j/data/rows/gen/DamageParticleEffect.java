
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DamageParticleEffects")
public class DamageParticleEffect
    extends BaseRow
{

    @Order(0)
    @Reference(Integer.class)
    private DamageParticleEffectType damageParticleEffectTypes;
    @Order(1)
    private Integer variation;
    @Order(2)
    private String pETFile;
    @Order(3)
    private Long key0;
    @Order(4)
    private Long key1;

}
