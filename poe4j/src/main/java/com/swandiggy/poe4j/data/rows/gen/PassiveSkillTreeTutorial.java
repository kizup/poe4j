
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("PassiveSkillTreeTutorial")
public class PassiveSkillTreeTutorial
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Characters charactersKey;
    @Order(2)
    private Long key0;
    @Order(3)
    private String choiceA_Description;
    @Order(4)
    private String choiceB_Description;
    @Order(5)
    private Long key1;
    @Order(6)
    private String choiceA_PassiveTreeURL;
    @Order(7)
    private String choiceB_PassiveTreeURL;
    @Order(8)
    private Long key2;
    @Order(9)
    private Long key3;

}
