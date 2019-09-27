
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SkillGemInfo")
public class SkillGemInfo
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String description;
    @Order(2)
    private String videoURL1;
    @Order(3)
    private SkillGems skillGemsKey;
    @Order(4)
    private String videoURL2;
    @Order(5)
    private List<Characters> charactersKeys;

}
