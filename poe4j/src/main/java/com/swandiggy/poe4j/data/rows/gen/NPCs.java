
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("NPCs")
public class NPCs
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String name;
    @Order(2)
    private String metadata;
    @Order(3)
    private Integer unknown0;
    @Order(4)
    private NPCMaster nPCMasterKey;
    @Order(5)
    private String shortName;
    @Order(6)
    private Integer unknown1;
    @Order(7)
    private NPCShop nPCShopKey;
    @Order(8)
    private List<NPCAudio> nPCAudioKeys1;
    @Order(9)
    private List<NPCAudio> nPCAudioKeys2;
    @Order(10)
    private Integer unknown2;

}
