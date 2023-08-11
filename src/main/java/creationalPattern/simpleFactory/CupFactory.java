package creationalPattern.simpleFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 【Static Factory Method】: Simple Factory Pattern, also known as Static Factory Method pattern, is a class creation
 * pattern. In the Simple Factory Pattern, different instances of classes can be returned based on different parameters.
 * The Simple Factory Pattern specifically defines a class to be responsible for creating instances of other classes,
 * and the instances created usually have a common parent class.
 */
public class CupFactory {
    public static Cup createCup(String brand){
        if (brand.equals("xiaomi"))
            return new XiaoMiCup();
        else if (brand.equals("huawei"))
            return new HuaWeiCup();
        else
            throw new IllegalArgumentException("无此品牌的杯子");
    }
}
