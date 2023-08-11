package creationalPattern.simpleFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cup {
    private String material;
    private String color;
    private String brand;
}

@Data
class XiaoMiCup extends Cup{
    {
        this.setBrand("xiaomi");
    }
}

@Data
class HuaWeiCup extends Cup{
    {
        this.setBrand("HuaWei");
    }
}