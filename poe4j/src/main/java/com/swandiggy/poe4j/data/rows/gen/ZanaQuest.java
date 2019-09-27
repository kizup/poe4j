
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("ZanaQuests")
public class ZanaQuest
    extends BaseRow
{

    @Order(0)
    private Quest questKey;
    @Order(1)
    private Integer unknown2;
    @Order(2)
    private List<Integer> unknown3;
    @Order(3)
    private Integer unknown5;
    @Order(4)
    private Integer unknown6;
    @Order(5)
    private Boolean flag1;
    @Order(6)
    private Boolean flag2;

}
