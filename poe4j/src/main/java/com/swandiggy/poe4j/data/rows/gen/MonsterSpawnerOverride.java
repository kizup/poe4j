
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterSpawnerOverrides")
public class MonsterSpawnerOverride
    extends BaseRow
{

    @Order(0)
    private Long key0;
    @Order(1)
    private MonsterVarieties base_MonsterVarietiesKey;
    @Order(2)
    private MonsterVarieties override_MonsterVarietiesKey;

}
