
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BetrayalDialogue")
public class BetrayalDialogue
    extends BaseRow
{

    @Order(0)
    private BetrayalDialogueCue betrayalDialogueCueKey;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private Integer unknown2;
    @Order(3)
    private List<Integer> unknown3;
    @Order(4)
    private BetrayalTargets betrayalTargetsKey;
    @Order(5)
    private Integer unknown4;
    @Order(6)
    private Long key2;
    @Order(7)
    private List<Long> keys1;
    @Order(8)
    private BetrayalUpgrades betrayalUpgradesKey;
    @Order(9)
    private Boolean flag0;
    @Order(10)
    private List<Integer> unknown5;
    @Order(11)
    private List<Long> keys0;
    @Order(12)
    private Boolean flag1;
    @Order(13)
    private List<Integer> unknown6;
    @Order(14)
    private NPCTextAudio nPCTextAudioKey;
    @Order(15)
    private List<Integer> unknown7;

}
