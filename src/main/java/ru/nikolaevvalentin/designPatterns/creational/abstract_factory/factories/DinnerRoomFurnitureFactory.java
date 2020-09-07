package ru.nikolaevvalentin.designPatterns.creational.abstract_factory.factories;

import ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts.*;

public class DinnerRoomFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new Armchair();
    }

    @Override
    public Sofa createSofa() {
        return new SoftSofa();
    }

    @Override
    public Table createTable() {
        return new DiningTable();
    }
}
