package ru.nikolaevvalentin.designPatterns.behavioral.strategy;

import ru.nikolaevvalentin.designPatterns.behavioral.strategy.RouteMakers.RouteForCarMaker;
import ru.nikolaevvalentin.designPatterns.behavioral.strategy.RouteMakers.RouteMaker;
import ru.nikolaevvalentin.designPatterns.behavioral.strategy.RouteMakers.WalkingRouteMaker;

public class Navigator {

    private String     pointA;
    private String     pointB;
    private RouteMaker routeMaker;
    private Route      route;

    public Navigator(String placeA, String placeB) {
        this.pointA = placeA;
        this.pointB = placeB;
    }

    public void setPointA(String pointA) {
        this.pointA = pointA;
    }

    public void setPointB(String pointB) {
        this.pointB = pointB;
    }

    public void setRouteForCarMaker() {
        routeMaker = new RouteForCarMaker();
    }

    public void setWalkingRouteMaker() {
        routeMaker = new WalkingRouteMaker();
    }

    public String getRoute() {
        route = routeMaker.makeRoute(pointA, pointB);
        return route.toString();
    }
}
