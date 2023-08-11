package creationalPattern.factoryMethod;

public class VivoCupFactory extends AbstractCupFactory{

    @Override
    public AbstractCup createCup() {
        return new VivoCup();
    }
}
