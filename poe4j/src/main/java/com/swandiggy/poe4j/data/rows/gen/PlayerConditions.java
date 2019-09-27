
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("PlayerConditions")
public class PlayerConditions
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<BuffDefinitions> buffDefinitionsKeys;
    @Order(2)
    private Boolean unknown8;
    @Order(3)
    private Integer buffStacks;
    @Order(4)
    private Characters charactersKey;
    @Order(5)
    private List<Stats> statsKeys;
    @Order(6)
    private Boolean unknown9;
    @Order(7)
    private Integer statValue;

}
