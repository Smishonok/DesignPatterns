package ru.nikolaevvalentin.designPatterns.behavioral.strategy.RouteMakers;

import ru.nikolaevvalentin.designPatterns.behavioral.strategy.Route;

public class RouteForCarMaker implements RouteMaker {

    @Override
    public Route makeRoute(String placeA, String placeB) {
        Route route = new Route();
        route.setRouteFromAToB("Route from " + placeA + " to " + placeB + " on car.");
        return route;
    }
}
