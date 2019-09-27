
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("UITalkText")
public class UITalkText
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    @Reference(Integer.class)
    private UITalkCategorie uITalkCategoriesKey;
    @Order(2)
    private String oGGFile;
    @Order(3)
    private String text;
    @Order(4)
    private Byte flag0;
    @Order(5)
    private Long key0;

}
