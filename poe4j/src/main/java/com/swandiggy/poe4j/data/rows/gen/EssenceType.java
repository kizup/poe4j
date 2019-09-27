
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("EssenceType")
public class EssenceType
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer essenceType;
    @Order(2)
    private Boolean isCorruptedEssence;
    @Order(3)
    private Words wordsKey;

}
