
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BeyondDemons")
public class BeyondDemon
    extends BaseRow
{

    @Order(0)
    private MonsterVarieties monsterVarietiesKey;
    @Order(1)
    private Boolean flag0;
    @Order(2)
    private Boolean flag1;

}
