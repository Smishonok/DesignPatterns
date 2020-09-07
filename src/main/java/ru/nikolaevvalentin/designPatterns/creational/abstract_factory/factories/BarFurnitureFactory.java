package ru.nikolaevvalentin.designPatterns.creational.abstract_factory.factories;

import ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts.*;

public class BarFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new BarChair();
    }

    @Override
    public Sofa createSofa() {
        return new BarSofa();
    }

    @Override
    public Table createTable() {
        return new BarTable();
    }
}
