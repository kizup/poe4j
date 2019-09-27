
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BlightTowerAuras")
public class BlightTowerAura
    extends BaseRow
{

    @Order(0)
    private Integer id;
    @Order(1)
    private BuffDefinitions buffDefinitionsKey;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private MiscAnimated miscAnimatedKey;

}
