
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Hideouts")
public class Hideout
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private WorldAreas smallWorldAreasKey;
    @Order(2)
    private Integer unknown0;
    @Order(3)
    private String hideoutFile;
    @Order(4)
    private List<Long> keys0;
    @Order(5)
    private WorldAreas largeWorldAreasKey;
    @Order(6)
    private String hideoutImage;
    @Order(7)
    private Byte isEnabled;
    @Order(8)
    private Integer weight;
    @Order(9)
    private HideoutRarity key0;
    @Order(10)
    private Boolean flag1;
    @Order(11)
    private String name;
    @Order(12)
    private List<Integer> data0;

}
