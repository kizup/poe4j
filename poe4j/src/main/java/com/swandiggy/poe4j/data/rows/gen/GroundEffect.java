
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
@DatFile("GroundEffects")
public class GroundEffect
    extends BaseRow
{

    @Order(0)
    private Integer unknown0;
    @Order(1)
    @Reference(Integer.class)
    private GroundEffectType groundEffectTypesKey;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private Boolean flag0;
    @Order(4)
    private Boolean flag1;
    @Order(5)
    private List<MiscObjects> miscObjectsKeys;

}
