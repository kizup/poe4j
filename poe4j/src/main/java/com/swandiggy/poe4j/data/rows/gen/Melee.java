
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Melee")
public class Melee
    extends BaseRow
{

    @Order(0)
    private Long unknown0;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private Long key0;
    @Order(3)
    private MeleeTrails meleeTrailsKey1;
    @Order(4)
    private MeleeTrails meleeTrailsKey2;
    @Order(5)
    private MeleeTrails meleeTrailsKey3;
    @Order(6)
    private MeleeTrails meleeTrailsKey4;
    @Order(7)
    private MeleeTrails meleeTrailsKey5;
    @Order(8)
    private MeleeTrails meleeTrailsKey6;
    @Order(9)
    private MeleeTrails meleeTrailsKey7;
    @Order(10)
    private Byte unknown20;
    @Order(11)
    private String surgeEffect_EPKFile;

}
