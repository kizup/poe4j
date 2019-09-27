
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("CharacterStartStates")
public class CharacterStartStates
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String description;
    @Order(2)
    private Characters charactersKey;
    @Order(3)
    private Integer level;
    @Order(4)
    private List<PassiveSkills> passiveSkillsKeys;
    @Order(5)
    private Boolean isPVP;
    @Order(6)
    private CharacterStartStateSet characterStartStateSetKey;
    @Order(7)
    private Long key1;
    @Order(8)
    private List<CharacterStartQuestState> characterStartQuestStateKeys;
    @Order(9)
    private Byte bool0;
    @Order(10)
    private String infoText;
    @Order(11)
    private Long key0;

}
