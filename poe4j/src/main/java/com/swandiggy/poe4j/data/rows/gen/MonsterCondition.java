
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterConditions")
public class MonsterCondition
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private Long key0;
    @Order(3)
    private Integer unknown3;
    @Order(4)
    private List<Long> keys1;
    @Order(5)
    private Byte flag0;
    @Order(6)
    private Byte flag1;
    @Order(7)
    private List<Long> keys2;
    @Order(8)
    private List<Integer> unknown6;
    @Order(9)
    private Integer unknown7;

}
