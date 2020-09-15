package ru.nikolaevvalentin.designPatterns.behavioral.strategy.RouteMakers;

import ru.nikolaevvalentin.designPatterns.behavioral.strategy.Route;

public interface RouteMaker {

    Route makeRoute(String placeA, String placeB);

}
