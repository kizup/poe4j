
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("UniqueStashLayout")
public class UniqueStashLayout
    extends BaseRow
{

    @Order(0)
    private Long uniqueItemsKey;
    @Order(1)
    private ItemVisualIdentity itemVisualIdentityKey;
    @Order(2)
    private UniqueStashTypes uniqueStashTypesKey;
    @Order(3)
    private Long key3;
    @Order(4)
    private Integer unknown1;
    @Order(5)
    private Integer unknown2;
    @Order(6)
    private Boolean flag0;
    @Order(7)
    private Boolean flag1;
    @Order(8)
    @Reference(Integer.class)
    private UniqueStashLayout uniqueStashLayoutKey;
    @Order(9)
    @Reference(Integer.class)
    private UniqueStashLayout uniqueStashLayoutKey2;
    @Order(10)
    private Boolean flag2;

}
