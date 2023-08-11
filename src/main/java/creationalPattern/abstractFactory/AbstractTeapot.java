package creationalPattern.abstractFactory;

import lombok.Data;

@Data
public class AbstractTeapot{
    private String color;
    private String brand;
}

@Data
class HuaWeiTeapot extends AbstractTeapot{
    {
        this.setBrand("HuaWei");
    }
}

@Data
class XiaoMiTeapot extends AbstractTeapot{
    {
        this.setBrand("XiaoMi");
    }
}

@Data
class VivoTeapot extends AbstractTeapot{
    {
        this.setBrand("vivo");
    }
}