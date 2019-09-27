
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("UniqueChests")
public class UniqueChest
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Words wordsKey;
    @Order(2)
    private FlavourText flavourTextKey;
    @Order(3)
    private Integer minLevel;
    @Order(4)
    private List<Mods> modsKeys;
    @Order(5)
    private Integer spawnWeight;
    @Order(6)
    private List<Integer> data1;
    @Order(7)
    private String aOFile;
    @Order(8)
    private Boolean flag0;
    @Order(9)
    private List<Integer> data2;
    @Order(10)
    private Chests appearanceChestsKey;
    @Order(11)
    private Chests chestsKey;

}
