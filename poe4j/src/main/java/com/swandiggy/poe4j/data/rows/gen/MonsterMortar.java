
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MonsterMortar")
public class MonsterMortar
    extends BaseRow
{

    @Order(0)
    private Integer id;
    @Order(1)
    private Long key0;
    @Order(2)
    private Long key1;
    @Order(3)
    private Long key2;
    @Order(4)
    private Integer unknown0;
    @Order(5)
    private Byte flag0;
    @Order(6)
    private Boolean flag1;
    @Order(7)
    private Boolean flag2;
    @Order(8)
    private Boolean flag3;
    @Order(9)
    private Integer unknown2;
    @Order(10)
    private Boolean flag4;
    @Order(11)
    private Integer unknown3;
    @Order(12)
    private Integer unknown4;

}
