
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SupporterPackSets")
public class SupporterPackSet
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String formatTitle;
    @Order(2)
    private String background;
    @Order(3)
    private String time0;
    @Order(4)
    private String time1;
    @Order(5)
    private List<Integer> shopPackagePlatformKey;
    @Order(6)
    private String unknown0;

}
