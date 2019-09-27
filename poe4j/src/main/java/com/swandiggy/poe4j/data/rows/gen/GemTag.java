
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("GemTags")
public class GemTag
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String tag;
    @Order(2)
    private Long key0;
    @Order(3)
    private Long key1;
    @Order(4)
    private Long key2;

}
