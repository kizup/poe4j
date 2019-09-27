
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BetrayalUpgrades")
public class BetrayalUpgrades
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private String description;
    @Order(3)
    private List<Mods> modsKey;
    @Order(4)
    private String artFile;
    @Order(5)
    private Integer betrayalUpgradeSlotsKey;
    @Order(6)
    private List<Integer> unknown7;
    @Order(7)
    private ItemVisualIdentity itemVisualIdentityKey0;
    @Order(8)
    private ItemVisualIdentity itemVisualIdentityKey1;
    @Order(9)
    private Long key2;
    @Order(10)
    private Integer unknown11;
    @Order(11)
    private Long key3;

}
