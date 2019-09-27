
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Music")
public class Music
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String soundFile;
    @Order(2)
    private String bankFile;
    @Order(3)
    private Integer unknown0;
    @Order(4)
    private Byte isAvailableInHideout;
    @Order(5)
    private String name;
    @Order(6)
    private Integer unknown5;
    @Order(7)
    private List<Long> keys0;

}
