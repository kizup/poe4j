
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AlternatePassiveAdditions")
public class AlternatePassiveAddition
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private AlternateTreeVersions alternateTreeVersionsKey;
    @Order(2)
    private Integer spawnWeight;
    @Order(3)
    private List<Stats> statsKeys;
    @Order(4)
    private Integer stat1Min;
    @Order(5)
    private Integer stat1Max;
    @Order(6)
    private Integer unknown6;
    @Order(7)
    private Integer unknown7;
    @Order(8)
    private Integer unknown8;
    @Order(9)
    private Integer unknown9;
    @Order(10)
    private List<Integer> passiveType;
    @Order(11)
    private Integer unknown11;

}
