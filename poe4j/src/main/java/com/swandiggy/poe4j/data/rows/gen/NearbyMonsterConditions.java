
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NearbyMonsterConditions")
public class NearbyMonsterConditions
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<MonsterVarieties> monsterVarietiesKeys;
    @Order(2)
    private Integer monsterAmount;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private Boolean isNegated;
    @Order(5)
    private Integer unknown4;
    @Order(6)
    private List<Integer> unknown5;
    @Order(7)
    private Boolean isLessThen;
    @Order(8)
    private Integer minimumHealthPercentage;

}
