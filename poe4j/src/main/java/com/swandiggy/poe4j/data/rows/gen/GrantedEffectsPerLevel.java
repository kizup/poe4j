
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("GrantedEffectsPerLevel")
public class GrantedEffectsPerLevel
    extends BaseRow
{

    @Order(0)
    private GrantedEffect grantedEffectsKey;
    @Order(1)
    private Integer level;
    @Order(2)
    private List<Stats> statsKeys;
    @Order(3)
    private Float stat1Float;
    @Order(4)
    private Float stat2Float;
    @Order(5)
    private Float stat3Float;
    @Order(6)
    private Float stat4Float;
    @Order(7)
    private Float stat5Float;
    @Order(8)
    private Float stat6Float;
    @Order(9)
    private Float stat7Float;
    @Order(10)
    private Float stat8Float;
    @Order(11)
    private List<EffectivenessCostConstant> effectivenessCostConstantsKeys;
    @Order(12)
    private Integer stat1Value;
    @Order(13)
    private Integer stat2Value;
    @Order(14)
    private Integer stat3Value;
    @Order(15)
    private Integer stat4Value;
    @Order(16)
    private Integer stat5Value;
    @Order(17)
    private Integer stat6Value;
    @Order(18)
    private Integer stat7Value;
    @Order(19)
    private Integer stat8Value;
    @Order(20)
    private Integer levelRequirement;
    @Order(21)
    private Integer manaMultiplier;
    @Order(22)
    private Integer levelRequirement2;
    @Order(23)
    private Integer levelRequirement3;
    @Order(24)
    private List<Stats> quality_StatsKeys;
    @Order(25)
    private List<Integer> quality_Values;
    @Order(26)
    private Integer criticalStrikeChance;
    @Order(27)
    private Integer manaCost;
    @Order(28)
    private Integer damageEffectiveness;
    @Order(29)
    private Integer storedUses;
    @Order(30)
    private Integer cooldown;
    @Order(31)
    private Integer cooldownBypassType;
    @Order(32)
    private List<Stats> statsKeys2;
    @Order(33)
    private Boolean unknown30a;
    @Order(34)
    private Integer vaalSouls;
    @Order(35)
    private Integer vaalStoredUses;
    @Order(36)
    private Integer cooldownGroup;
    @Order(37)
    private Integer manaReservationOverride;
    @Order(38)
    private Integer unknown37;
    @Order(39)
    private Integer damageMultiplier;
    @Order(40)
    private Integer unknown45;
    @Order(41)
    private Integer unknown46;
    @Order(42)
    private List<Integer> statInterpolationTypesKeys;
    @Order(43)
    private Integer unknown0;
    @Order(44)
    private Integer vaalSoulGainPreventionTime;
    @Order(45)
    private Long key0;
    @Order(46)
    private Integer unknown1;
    @Order(47)
    private Integer attackSpeedMultiplier;

}
