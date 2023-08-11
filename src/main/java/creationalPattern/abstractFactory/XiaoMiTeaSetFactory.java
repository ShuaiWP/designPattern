package creationalPattern.abstractFactory;

public class XiaoMiTeaSetFactory extends AbstractTeaSetFactory{
    @Override
    public AbstractTeaSet createSonTeaSet() {
        return new XiaomiTeaSet();
    }

    @Override
    public AbstractCup createCup() {
        return new XiaoMiCup();
    }

    @Override
    public AbstractTeapot createTeapot() {
        return new XiaoMiTeapot();
    }

    @Override
    public String setBrand() {
        return "xiaomi";
    }
}
