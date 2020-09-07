package ru.nikolaevvalentin.designPatterns.creational.factory_method.bakery;

import ru.nikolaevvalentin.designPatterns.creational.factory_method.pastry.Cake;
import ru.nikolaevvalentin.designPatterns.creational.factory_method.pastry.Pastry;

public class CakeBakery implements Bakery {

    @Override
    public Pastry getPastry() {
        return new Cake();
    }
}
