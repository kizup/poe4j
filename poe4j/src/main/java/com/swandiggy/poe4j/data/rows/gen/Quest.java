
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Quest")
public class Quest
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Integer act;
    @Order(2)
    private String name;
    @Order(3)
    private Integer questState;
    @Order(4)
    private String icon_DDSFile;
    @Order(5)
    private Integer questId;
    @Order(6)
    private Integer unknown0;
    @Order(7)
    private Boolean flag0;
    @Order(8)
    private Long unknown7;
    @Order(9)
    private List<Integer> unknown8;
    @Order(10)
    private Integer unknown9;
    @Order(11)
    private Integer unknown10;

}
