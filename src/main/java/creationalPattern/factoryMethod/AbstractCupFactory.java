package creationalPattern.factoryMethod;

/**
 * 【Factory Method】: The Factory Method Pattern, also known as the Factory Pattern, Virtual Constructor Pattern, or
 * Polymorphic Factory Pattern, is a class creation pattern. In the Factory Method Pattern, the factory parent class is
 * responsible for defining the public interface for creating product objects, while the factory subclass is responsible
 * for generating specific product objects. The purpose of this is to delay the instantiation operation of the product
 * class to the factory subclass, that is, to determine which specific product class should be instantiated through the
 * factory subclass.
 */
public abstract class AbstractCupFactory {
    public abstract AbstractCup createCup();
}





