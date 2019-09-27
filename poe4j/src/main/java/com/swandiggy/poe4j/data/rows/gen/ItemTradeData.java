
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ItemTradeData")
public class ItemTradeData
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Long> keys0;
    @Order(2)
    private Boolean flag0;
    @Order(3)
    private String categoryId;
    @Order(4)
    private String mapId;
    @Order(5)
    private List<Prophecies> prophecyKeys;
    @Order(6)
    private Boolean flag1;

}
