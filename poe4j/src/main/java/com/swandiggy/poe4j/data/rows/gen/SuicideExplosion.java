
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SuicideExplosion")
public class SuicideExplosion
    extends BaseRow
{

    @Order(0)
    private Integer id;
    @Order(1)
    private Long key0;
    @Order(2)
    private Long key1;
    @Order(3)
    private Boolean flag0;
    @Order(4)
    private Boolean flag1;
    @Order(5)
    private Boolean flag2;
    @Order(6)
    private Boolean flag3;
    @Order(7)
    private Integer unknown1;

}
