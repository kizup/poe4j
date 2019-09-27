
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("PantheonSouls")
public class PantheonSoul
    extends BaseRow
{

    @Order(0)
    private Long key0;
    @Order(1)
    private BaseItemTypes baseItemTypesKey;
    @Order(2)
    private Integer unknown0;
    @Order(3)
    private Long key1;
    @Order(4)
    private Long key2;

}
