package creationalPattern.abstractFactory;

public class HuaWeiTeaSetFactory extends AbstractTeaSetFactory{
    @Override
    public AbstractTeaSet createSonTeaSet() {
        return new HuaWeiTeaSet();
    }

    @Override
    public AbstractCup createCup() {
        return new HuaWeiCup();
    }

    @Override
    public AbstractTeapot createTeapot() {
        return new HuaWeiTeapot();
    }

    @Override
    public String setBrand() {
        return "huawei";
    }
}
