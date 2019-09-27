
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("IncursionRooms")
public class IncursionRooms
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private Integer tier;
    @Order(3)
    private Integer minLevel;
    @Order(4)
    private IncursionRooms roomUpgrade_IncursionRoomsKey;
    @Order(5)
    private Mods modsKey;
    @Order(6)
    private String presentARMFile;
    @Order(7)
    private Integer intId;
    @Order(8)
    private IncursionArchitect incursionArchitectKey;
    @Order(9)
    private String pastARMFile;
    @Order(10)
    private String tSIFile;
    @Order(11)
    private String uIIcon;
    @Order(12)
    private String flavourText;
    @Order(13)
    private String description;
    @Order(14)
    private List<AchievementItems> achievementItemsKeys;
    @Order(15)
    private Integer unknown0;
    @Order(16)
    private Integer unknown1;
    @Order(17)
    private IncursionRooms roomUpgradeFrom_IncursionRoomsKey;

}
