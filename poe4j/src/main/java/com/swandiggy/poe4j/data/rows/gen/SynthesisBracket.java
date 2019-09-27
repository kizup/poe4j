
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SynthesisBrackets")
public class SynthesisBracket
    extends BaseRow
{

    @Order(0)
    private Long key0;
    @Order(1)
    private Integer minLevel;
    @Order(2)
    private Integer maxLevel;
    @Order(3)
    private Long key1;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private Integer unknown5;
    @Order(6)
    private Integer unknown6;
    @Order(7)
    private Integer unknown7;

}
