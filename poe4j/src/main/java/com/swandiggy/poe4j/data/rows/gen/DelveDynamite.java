
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("DelveDynamite")
public class DelveDynamite
    extends BaseRow
{

    @Order(0)
    private Integer unknown0;
    @Order(1)
    private MiscObjects flare_MiscObjectsKey;
    @Order(2)
    private Long key1;
    @Order(3)
    private MiscObjects dynamite_MiscObjectsKey;
    @Order(4)
    private Integer unknown7;
    @Order(5)
    private Integer unknown8;
    @Order(6)
    private Integer unknown9;
    @Order(7)
    private Integer unknown10;
    @Order(8)
    private Integer unknown11;
    @Order(9)
    private Integer unknown12;
    @Order(10)
    private Integer unknown13;
    @Order(11)
    private MiscAnimated miscAnimatedKey;
    @Order(12)
    private Integer unknown16;

}
