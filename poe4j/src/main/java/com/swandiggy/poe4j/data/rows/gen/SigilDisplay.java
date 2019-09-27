
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("SigilDisplay")
public class SigilDisplay
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Stats active_StatsKey;
    @Order(2)
    private Stats inactive_StatsKey;
    @Order(3)
    private String dDSFile;
    @Order(4)
    private String inactive_ArtFile;
    @Order(5)
    private String active_ArtFile;
    @Order(6)
    private String frame_ArtFile;

}
