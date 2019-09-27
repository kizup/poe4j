
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SkillGems")
public class SkillGems
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes baseItemTypesKey;
    @Order(1)
    private GrantedEffect grantedEffectsKey;
    @Order(2)
    private Integer str;
    @Order(3)
    private Integer dex;
    @Order(4)
    private Integer int;
    @Order(5)
    private List<GemTag> gemTagsKeys;
    @Order(6)
    private BaseItemTypes vaalVariant_BaseItemTypesKey;
    @Order(7)
    private Boolean flag0;
    @Order(8)
    private String description;
    @Order(9)
    private Mods consumed_ModsKey;
    @Order(10)
    private GrantedEffect grantedEffectsKey2;
    @Order(11)
    private Long key0;

}
