package ru.nikolaevvalentin.designPatterns.behavioral.strategy.RouteMakers;

import ru.nikolaevvalentin.designPatterns.behavioral.strategy.Route;

public class WalkingRouteMaker implements RouteMaker {

    @Override
    public Route makeRoute(String placeA, String placeB) {
        Route route = new Route();
        route.setRouteFromAToB("Walking route from " + placeA + " to " + placeB);
        return route;
    }
}

