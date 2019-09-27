
package com.swandiggy.poe4j.data.rows.gen;

import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("OnKillAchievements")
public class OnKillAchievement
    extends BaseRow
{

    @Order(0)
    private MonsterVarieties monsterVarietiesKey;
    @Order(1)
    private Long key0;

}
