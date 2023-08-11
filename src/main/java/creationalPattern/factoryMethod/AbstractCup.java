package creationalPattern.factoryMethod;

import lombok.Data;

@Data
public class AbstractCup {
    private String color;
    private String brand;
}

@Data
class HuaWeiCup extends AbstractCup{
    {
        this.setBrand("HuaWei");
    }
}

@Data
class XiaoMiCup extends AbstractCup{
    {
        this.setBrand("XiaoMi");
    }
}

@Data
class VivoCup extends AbstractCup{
    {
        this.setBrand("vivo");
    }
}