
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("PassiveSkillBuffs")
public class PassiveSkillBuff
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private BuffDefinitions buffDefinitionsKey;
    @Order(2)
    private List<Integer> buff_StatValues;
    @Order(3)
    private Long key1;
    @Order(4)
    private Integer unknown4;
    @Order(5)
    private List<Integer> unknown5;

}
