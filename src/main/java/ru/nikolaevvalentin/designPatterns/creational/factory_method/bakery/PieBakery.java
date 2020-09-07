package ru.nikolaevvalentin.designPatterns.creational.factory_method.bakery;

import ru.nikolaevvalentin.designPatterns.creational.factory_method.pastry.Pastry;
import ru.nikolaevvalentin.designPatterns.creational.factory_method.pastry.Pie;

public class PieBakery implements Bakery {

    @Override
    public Pastry getPastry() {
        return new Pie();
    }
}
