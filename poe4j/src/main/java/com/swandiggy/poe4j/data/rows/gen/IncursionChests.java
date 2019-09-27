
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("IncursionChests")
public class IncursionChests
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Chests chestsKey;
    @Order(2)
    private Long key1;
    @Order(3)
    private Integer minLevel;
    @Order(4)
    private Integer maxLevel;
    @Order(5)
    private Integer weight;
    @Order(6)
    private Integer unknown8;

}
