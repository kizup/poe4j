
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("AdvancedSkillsTutorial")
public class AdvancedSkillsTutorial
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<Long> keys1;
    @Order(2)
    private List<Long> key2;
    @Order(3)
    private String description;
    @Order(4)
    private String international_BK2File;
    @Order(5)
    private Long key0;
    @Order(6)
    private String china_BK2File;
    @Order(7)
    private List<Characters> charactersKey;

}
