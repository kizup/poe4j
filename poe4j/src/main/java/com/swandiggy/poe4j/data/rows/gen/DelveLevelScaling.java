
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DelveLevelScaling")
public class DelveLevelScaling
    extends BaseRow
{

    @Order(0)
    private Integer depth;
    @Order(1)
    private Integer monsterLevel;
    @Order(2)
    private Integer unknown1;
    @Order(3)
    private Integer sulphiteCost;
    @Order(4)
    private Integer monsterLevel2;
    @Order(5)
    private Integer moreMonsterLife;
    @Order(6)
    private Integer moreMonsterDamage;
    @Order(7)
    private Integer darknessResistance;
    @Order(8)
    private Integer lightRadius;
    @Order(9)
    private Integer unknown4;
    @Order(10)
    private Integer unknown5;
    @Order(11)
    private Integer unknown6;
    @Order(12)
    private Integer unknown7;
    @Order(13)
    private Integer unknown8;

}
