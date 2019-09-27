
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("BuffVisuals")
public class BuffVisuals
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String buffDDSFile;
    @Order(2)
    private List<String> ePKFiles1;
    @Order(3)
    private List<String> ePKFiles2;
    @Order(4)
    private List<MiscAnimated> miscAnimatedKeys1;
    @Order(5)
    private List<MiscAnimated> miscAnimatedKeys2;
    @Order(6)
    private Integer unknown0;
    @Order(7)
    private List<PreloadGroups> preloadGroupsKeys;
    @Order(8)
    private Boolean flag0;
    @Order(9)
    private String buffName;
    @Order(10)
    private Long key0;
    @Order(11)
    private Long key1;
    @Order(12)
    private String buffDescription;
    @Order(13)
    private String ePKFile;
    @Order(14)
    private Boolean hasExtraArt;
    @Order(15)
    private String extraArt;

}
