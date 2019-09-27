
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Archetypes")
public class Archetype
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Characters charactersKey;
    @Order(2)
    private String passiveSkillTreeURL;
    @Order(3)
    private String ascendancyClassName;
    @Order(4)
    private String description;
    @Order(5)
    private String uIImageFile;
    @Order(6)
    private String tutorialVideo_BKFile;
    @Order(7)
    private Integer unknown0;
    @Order(8)
    private Float unknown1;
    @Order(9)
    private Float unknown2;
    @Order(10)
    private String backgroundImageFile;
    @Order(11)
    private Boolean isTemporary;
    @Order(12)
    private Boolean flag0;
    @Order(13)
    private String archetypeImage;
    @Order(14)
    private Boolean flag1;

}
