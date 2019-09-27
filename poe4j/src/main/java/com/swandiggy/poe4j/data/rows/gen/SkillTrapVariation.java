
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SkillTrapVariations")
public class SkillTrapVariation
    extends BaseRow
{

    @Order(0)
    private Integer id;
    @Order(1)
    private String metadata;
    @Order(2)
    private Long key0;

}
