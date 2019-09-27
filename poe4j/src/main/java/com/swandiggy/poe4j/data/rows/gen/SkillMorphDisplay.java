
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SkillMorphDisplay")
public class SkillMorphDisplay
    extends BaseRow
{

    @Order(0)
    private Long key0;
    @Order(1)
    private List<Long> keys0;
    @Order(2)
    private List<String> dDSFiles;

}
