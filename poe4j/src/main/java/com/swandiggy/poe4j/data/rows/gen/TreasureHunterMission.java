
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("TreasureHunterMissions")
public class TreasureHunterMission
    extends BaseRow
{

    @Order(0)
    private String unknown0;
    @Order(1)
    private Long unknown1;
    @Order(2)
    private Long unknown3;
    @Order(3)
    private List<Long> unknown5;
    @Order(4)
    private List<Long> unknown7;
    @Order(5)
    private List<Long> unknown9;
    @Order(6)
    private Integer unknown11;
    @Order(7)
    private Integer unknown12;
    @Order(8)
    private Integer unknown13;
    @Order(9)
    private Integer unknown14;
    @Order(10)
    private Integer unknown15;
    @Order(11)
    private Byte unknown19;
    @Order(12)
    private Integer unknown16;
    @Order(13)
    private Integer unknown17;
    @Order(14)
    private Integer unknown18;

}
