
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("IncursionChestRewards")
public class IncursionChestReward
    extends BaseRow
{

    @Order(0)
    private IncursionRooms incursionRoomsKey;
    @Order(1)
    private List<IncursionChests> incursionChestsKeys;
    @Order(2)
    private String unknown0;
    @Order(3)
    private Integer unknown1;
    @Order(4)
    private Integer unknown2;
    @Order(5)
    private Integer unknown3;

}
