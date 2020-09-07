package ru.nikolaevvalentin.designPatterns.creational.abstract_factory.factories;

import ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts.Chair;
import ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts.Sofa;
import ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts.Table;

public interface FurnitureFactory {

    Chair createChair();
    Sofa createSofa();
    Table createTable();

}
