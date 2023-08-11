package creationalPatternTest;

import creationalPattern.abstractFactory.AbstractTeaSet;
import creationalPattern.abstractFactory.AbstractTeaSetFactory;
import creationalPattern.abstractFactory.HuaWeiTeaSetFactory;
import creationalPattern.abstractFactory.XiaoMiTeaSetFactory;
import creationalPattern.factoryMethod.*;

import creationalPattern.simpleFactory.Cup;
import creationalPattern.simpleFactory.CupFactory;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void simpleFactoryTest(){
        try {
            Cup xiaomi = CupFactory.createCup("xiaomi");
            System.out.println("This cup brand is " + xiaomi.getBrand());
            Cup huawei = CupFactory.createCup("huawei");
            System.out.println("This cup brand is " + huawei.getBrand());
            Cup cup = CupFactory.createCup("  ");
            System.out.println(cup);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void factoryMethodTest(){
        AbstractCupFactory cupFactory = null;
        cupFactory = new HuaWeiCupFactory();
        AbstractCup huawei = cupFactory.createCup();
        cupFactory = new VivoCupFactory();
        AbstractCup vivo = cupFactory.createCup();
        cupFactory = new XiaoMiCupFactory();
        AbstractCup xiaomi = cupFactory.createCup();
        System.out.println(huawei.getBrand() + " " + vivo.getBrand() + " " + xiaomi.getBrand());
    }

    @Test
    public void abstractFactoryTest(){
        AbstractTeaSetFactory teaSetFactory = null;
        teaSetFactory = new HuaWeiTeaSetFactory();
        AbstractTeaSet huaweiTeaSet = teaSetFactory.createTeaSet();
        teaSetFactory = new XiaoMiTeaSetFactory();
        AbstractTeaSet xioamiTeaSet = teaSetFactory.createTeaSet();
        System.out.println(huaweiTeaSet.getClass());
        System.out.println( huaweiTeaSet.getBrand() + "   " + huaweiTeaSet.getCup().getBrand());
        System.out.println(xioamiTeaSet.getBrand() + "   " + xioamiTeaSet.getCup().getBrand());
    }
}
