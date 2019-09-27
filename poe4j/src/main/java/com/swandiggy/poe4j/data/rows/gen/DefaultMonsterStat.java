
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DefaultMonsterStats")
public class DefaultMonsterStat
    extends BaseRow
{

    @Order(0)
    private String displayLevel;
    @Order(1)
    private Float damage;
    @Order(2)
    private Integer evasion;
    @Order(3)
    private Integer accuracy;
    @Order(4)
    private Integer life;
    @Order(5)
    private Integer experience;
    @Order(6)
    private Integer allyLife;
    @Order(7)
    private Integer unknown0;
    @Order(8)
    private Integer difficulty;
    @Order(9)
    private Float damage2;
    @Order(10)
    private Integer unknown1;
    @Order(11)
    private Float unknown2;
    @Order(12)
    private Float unknown3;
    @Order(13)
    private Integer unknown4;
    @Order(14)
    private Integer unknown5;

}
