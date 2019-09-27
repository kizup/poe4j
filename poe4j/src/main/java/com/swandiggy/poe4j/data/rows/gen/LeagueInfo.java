
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("LeagueInfo")
public class LeagueInfo
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private String panelImage;
    @Order(2)
    private String headerImage;
    @Order(3)
    private List<String> screenshots;
    @Order(4)
    private String description;
    @Order(5)
    private String league;
    @Order(6)
    private Boolean flag0;
    @Order(7)
    private List<String> itemImages;
    @Order(8)
    private List<String> hoverImages;
    @Order(9)
    private String trailerVideoLink;

}
