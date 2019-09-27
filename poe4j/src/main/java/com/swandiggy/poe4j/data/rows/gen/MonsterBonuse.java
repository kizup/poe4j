
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterBonuses")
public class MonsterBonuse
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Long> keys0;
    @Order(2)
    private Long key0;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private List<Stats> statsKeys;
    @Order(6)
    private List<Integer> statValues;

}
