
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Prophecies")
public class Prophecies
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String predictionText;
    @Order(2)
    private Integer unknownUnique;
    @Order(3)
    private String name;
    @Order(4)
    private String flavourText;
    @Order(5)
    private List<ClientStrings> questTracker_ClientStringsKeys;
    @Order(6)
    private String oGGFile;
    @Order(7)
    private ProphecyChain prophecyChainKey;
    @Order(8)
    private Integer prophecyChainPosition;
    @Order(9)
    private Boolean isEnabled;
    @Order(10)
    private Integer sealCost;
    @Order(11)
    private String predictionText2;

}
