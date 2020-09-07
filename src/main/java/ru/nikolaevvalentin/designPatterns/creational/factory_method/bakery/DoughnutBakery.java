package ru.nikolaevvalentin.designPatterns.creational.factory_method.bakery;

import ru.nikolaevvalentin.designPatterns.creational.factory_method.pastry.Doughnut;
import ru.nikolaevvalentin.designPatterns.creational.factory_method.pastry.Pastry;

public class DoughnutBakery implements Bakery {

    @Override
    public Pastry getPastry() {
        return new Doughnut();
    }
}
