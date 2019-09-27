
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("Animation")
public class Animation
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Boolean flag0;
    @Order(2)
    private Boolean flag1;
    @Order(3)
    private Integer intId;
    @Order(4)
    private Boolean flag2;
    @Order(5)
    private Animation mainhand_AnimationKey;
    @Order(6)
    private Animation offhand_AnimationKey;

}
