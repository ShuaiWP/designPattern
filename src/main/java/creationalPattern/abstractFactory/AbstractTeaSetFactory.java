package creationalPattern.abstractFactory;

/**
 * 【Abstract Factory】: The Abstract Factory Pattern provides an interface for creating a series of related or
 * interdependent objects without specifying their concrete classes. The Abstract Factory Pattern is also known as the
 * Kit Pattern and belongs to the object creation pattern.
 */
public abstract class AbstractTeaSetFactory {
    public AbstractTeaSet createTeaSet(){
        AbstractTeaSet abstractTeaSet = createSonTeaSet();
        abstractTeaSet.setCup(createCup());
        abstractTeaSet.setTeapot(createTeapot());
        abstractTeaSet.setBrand(setBrand());
        return abstractTeaSet;
    }

    public abstract AbstractTeaSet createSonTeaSet();
    public abstract AbstractCup createCup();
    public abstract AbstractTeapot createTeapot();
    public abstract String setBrand();
}

