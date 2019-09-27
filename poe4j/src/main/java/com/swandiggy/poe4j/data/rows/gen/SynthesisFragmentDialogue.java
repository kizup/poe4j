
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SynthesisFragmentDialogue")
public class SynthesisFragmentDialogue
    extends BaseRow
{

    @Order(0)
    private Long key0;
    @Order(1)
    private NPCTextAudio nPCTextAudioKey1;
    @Order(2)
    private NPCTextAudio nPCTextAudioKey2;
    @Order(3)
    private NPCTextAudio nPCTextAudioKey3;
    @Order(4)
    private NPCTextAudio nPCTextAudioKey4;
    @Order(5)
    private NPCTextAudio nPCTextAudioKey5;
    @Order(6)
    private NPCTextAudio nPCTextAudioKey6;

}
