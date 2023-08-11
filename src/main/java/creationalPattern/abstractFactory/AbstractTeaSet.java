package creationalPattern.abstractFactory;

import lombok.Data;

@Data
public class AbstractTeaSet {
    private AbstractCup Cup;
    private AbstractTeapot Teapot;
    private String brand;
}

@Data
class HuaWeiTeaSet extends AbstractTeaSet{
    {
        this.setBrand("HuaWei");
    }
}
@Data
class XiaomiTeaSet extends AbstractTeaSet{
    {
        this.setBrand("XiaoMi");
    }
}