
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.annotations.Reference;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("HideoutNPCs")
public class HideoutNPCs
    extends BaseRow
{

    @Order(0)
    private NPCs hideout_NPCsKey;
    @Order(1)
    private List<NPCs> regular_NPCsKeys;
    @Order(2)
    private HideoutDoodads hideoutDoodadsKey;
    @Order(3)
    @Reference(Integer.class)
    private NPCMaster nPCMasterKey;
    @Order(4)
    private Integer unknown0;
    @Order(5)
    private Integer unknown1;
    @Order(6)
    private Integer unknown2;

}
