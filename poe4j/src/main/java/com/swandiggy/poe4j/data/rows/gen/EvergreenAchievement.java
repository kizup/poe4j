
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("EvergreenAchievements")
public class EvergreenAchievement
    extends BaseRow
{

    @Order(0)
    private Integer unknown0;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private List<Long> keys0;

}
