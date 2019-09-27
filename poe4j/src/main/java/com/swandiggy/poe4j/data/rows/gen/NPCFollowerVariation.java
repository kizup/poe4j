
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NPCFollowerVariations")
public class NPCFollowerVariation
    extends BaseRow
{

    @Order(0)
    private MonsterVarieties monsterVarietiesKey;
    @Order(1)
    private MiscAnimated miscAnimatedKey0;
    @Order(2)
    private MiscAnimated miscAnimatedKey1;
    @Order(3)
    private Boolean flag0;
    @Order(4)
    private Boolean flag1;
    @Order(5)
    private Integer unknown3;
    @Order(6)
    private Integer unknown4;
    @Order(7)
    private Integer unknown5;
    @Order(8)
    private Integer unknown6;
    @Order(9)
    private Integer unknown7;
    @Order(10)
    private Boolean flag2;
    @Order(11)
    private Boolean flag3;

}
