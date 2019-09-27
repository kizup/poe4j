
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Projectiles")
public class Projectiles
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private List<String> aOFiles;
    @Order(2)
    private List<String> loopAnimationIds;
    @Order(3)
    private List<String> impactAnimationIds;
    @Order(4)
    private Integer projectileSpeed;
    @Order(5)
    private Boolean flag0;
    @Order(6)
    private Integer unknown0;
    @Order(7)
    private Boolean flag1;
    @Order(8)
    private Boolean flag2;
    @Order(9)
    private String inheritsFrom;
    @Order(10)
    private Integer unknown1;
    @Order(11)
    private Long key0;
    @Order(12)
    private Integer unknown2;

}
