package creationalPattern.factoryMethod;

public class XiaoMiCupFactory extends AbstractCupFactory{

    @Override
    public AbstractCup createCup() {
        return new XiaoMiCup();
    }
}