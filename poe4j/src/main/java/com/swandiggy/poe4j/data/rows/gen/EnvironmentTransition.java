
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("EnvironmentTransitions")
public class EnvironmentTransition
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<String> oTFiles;
    @Order(2)
    private List<String> data0;

}
