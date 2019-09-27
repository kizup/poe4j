
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("GrantedEffects")
public class GrantedEffect
    extends BaseRow
{

    @Order(0)
    private String id;
    @Order(1)
    private Boolean isSupport;
    @Order(2)
    private List<Integer> allowedActiveSkillTypes;
    @Order(3)
    private Float baseEffectiveness;
    @Order(4)
    private Float incrementalEffectiveness;
    @Order(5)
    private String supportGemLetter;
    @Order(6)
    private Integer unknown0;
    @Order(7)
    private List<Integer> addedActiveSkillTypes;
    @Order(8)
    private List<Integer> excludedActiveSkillTypes;
    @Order(9)
    private Boolean supportsGemsOnly;
    @Order(10)
    private Integer unknown1;
    @Order(11)
    private List<Integer> data3;
    @Order(12)
    private Boolean flag1;
    @Order(13)
    private Integer unknown2;
    @Order(14)
    private Integer castTime;
    @Order(15)
    private ActiveSkill activeSkillsKey;
    @Order(16)
    private Boolean flag2;
    @Order(17)
    private Boolean flag3;
    @Order(18)
    private List<Integer> data4;
    @Order(19)
    private Long key0;
    @Order(20)
    private Long key1;
    @Order(21)
    private Boolean flag4;
    @Order(22)
    private List<Long> keys0;

}
