
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NPCTalk")
public class NPCTalk
    extends BaseRow
{

    @Order(0)
    private NPCs nPCKey;
    @Order(1)
    private Integer unknown2;
    @Order(2)
    private String dialogueOption;
    @Order(3)
    private List<Integer> data0;
    @Order(4)
    private List<Integer> data1;
    @Order(5)
    private List<Integer> data2;
    @Order(6)
    private String script;
    @Order(7)
    private Integer unknown11;
    @Order(8)
    private Integer unknown12;
    @Order(9)
    private Quest questKey;
    @Order(10)
    private Integer unknown15;
    @Order(11)
    private List<NPCTextAudio> nPCTextAudioKeys;
    @Order(12)
    private String script2;
    @Order(13)
    private Boolean flag0;
    @Order(14)
    private Boolean flag1;
    @Order(15)
    private List<Integer> data5;
    @Order(16)
    private List<Integer> data6;
    @Order(17)
    private Integer unknown19;
    @Order(18)
    private List<Integer> unknown20;
    @Order(19)
    private Integer unknown21;
    @Order(20)
    private Boolean flag2;
    @Order(21)
    private List<Long> keys0;
    @Order(22)
    private Long key0;
    @Order(23)
    private Boolean flag3;
    @Order(24)
    private Boolean flag4;
    @Order(25)
    private String dialogueOption2;
    @Order(26)
    private Long key1;
    @Order(27)
    private Long key2;
    @Order(28)
    private Integer unknown22;

}
