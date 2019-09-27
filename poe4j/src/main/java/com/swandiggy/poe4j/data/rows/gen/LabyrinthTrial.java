
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LabyrinthTrials")
public class LabyrinthTrial
    extends BaseRow
{

    @Order(0)
    private WorldAreas worldAreas;
    @Order(1)
    private Integer unknown2;
    @Order(2)
    private Integer unknown3;
    @Order(3)
    private Integer unknown4;
    @Order(4)
    private NPCTextAudio nPCTextAudioKey;
    @Order(5)
    private String unknown7;
    @Order(6)
    private String unknown8;

}
