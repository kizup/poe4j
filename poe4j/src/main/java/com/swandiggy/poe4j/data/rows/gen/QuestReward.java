
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("QuestRewards")
public class QuestReward
    extends BaseRow
{

    @Order(0)
    private Quest questKey;
    @Order(1)
    private Integer unknown1;
    @Order(2)
    private Characters charactersKey;
    @Order(3)
    private BaseItemTypes baseItemTypesKey;
    @Order(4)
    private Integer itemLevel;
    @Order(5)
    private Integer rarityKey;
    @Order(6)
    private Integer unknown2;
    @Order(7)
    private String socketGems;
    @Order(8)
    private Long key0;
    @Order(9)
    private Long key1;
    @Order(10)
    private Integer unknown3;
    @Order(11)
    private Boolean flag1;
    @Order(12)
    private Boolean flag2;
    @Order(13)
    private List<Long> keys0;
    @Order(14)
    private Integer unknown4;
    @Order(15)
    private Integer unknown5;

}
