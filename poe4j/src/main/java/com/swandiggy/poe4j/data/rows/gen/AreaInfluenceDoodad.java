
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AreaInfluenceDoodads")
public class AreaInfluenceDoodad
    extends BaseRow
{

    @Order(0)
    private Stats statsKey;
    @Order(1)
    private Integer statValue;
    @Order(2)
    private Float unknown2;
    @Order(3)
    private List<String> aOFiles;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private Byte unknown7;

}
