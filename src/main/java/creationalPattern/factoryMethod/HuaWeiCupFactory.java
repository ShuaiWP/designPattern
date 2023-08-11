package creationalPattern.factoryMethod;

public class HuaWeiCupFactory extends AbstractCupFactory{

    @Override
    public AbstractCup createCup() {
        return new HuaWeiCup();
    }
}
