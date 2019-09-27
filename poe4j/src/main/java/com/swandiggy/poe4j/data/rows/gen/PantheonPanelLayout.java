
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("PantheonPanelLayout")
public class PantheonPanelLayout
    extends BaseRow
{

    @Order(0)
    private String name;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private Boolean isMajorGod;
    @Order(4)
    private String coverImage;
    @Order(5)
    private String godName2;
    @Order(6)
    private Integer unknown5;
    @Order(7)
    private List<Stats> effect1_StatsKeys;
    @Order(8)
    private List<Integer> effect1_Values;
    @Order(9)
    private List<Stats> effect2_StatsKeys;
    @Order(10)
    private String godName3;
    @Order(11)
    private List<Integer> effect3_Values;
    @Order(12)
    private List<Stats> effect3_StatsKeys;
    @Order(13)
    private String godName4;
    @Order(14)
    private List<Stats> effect4_StatsKeys;
    @Order(15)
    private List<Integer> effect4_Values;
    @Order(16)
    private String godName1;
    @Order(17)
    private List<Integer> effect2_Values;
    @Order(18)
    private Integer questState1;
    @Order(19)
    private Integer questState2;
    @Order(20)
    private Integer questState3;
    @Order(21)
    private Integer questState4;
    @Order(22)
    private Boolean isEnabled;

}
