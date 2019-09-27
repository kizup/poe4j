
package com.swandiggy.poe4j.data.rows.gen;

import java.util.List;
import com.swandiggy.poe4j.data.annotations.DatFile;
import com.swandiggy.poe4j.data.annotations.Order;
import com.swandiggy.poe4j.data.rows.BaseRow;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@DatFile("MicrotransactionCombineForumula")
public class MicrotransactionCombineForumula
    extends BaseRow
{

    @Order(0)
    private BaseItemTypes result_BaseItemTypesKey;
    @Order(1)
    private List<BaseItemTypes> ingredients_BaseItemTypesKeys;
    @Order(2)
    private String bK2File;
    @Order(3)
    private List<Integer> unknown1;

}
