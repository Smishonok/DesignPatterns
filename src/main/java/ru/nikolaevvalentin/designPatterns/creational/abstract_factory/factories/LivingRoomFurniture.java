package ru.nikolaevvalentin.designPatterns.creational.abstract_factory.factories;

import ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts.*;

public class LivingRoomFurniture implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new LeatherChair();
    }

    @Override
    public Sofa createSofa() {
        return new LeatherSofa();
    }

    @Override
    public Table createTable() {
        return new RedWoodTable();
    }
}
