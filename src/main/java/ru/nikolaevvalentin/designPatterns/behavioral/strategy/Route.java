package ru.nikolaevvalentin.designPatterns.behavioral.strategy;

public class Route {

    private String routeFromAToB;

    public Route() {
    }

    public void setRouteFromAToB(String routeFromAToB) {
        this.routeFromAToB = routeFromAToB;
    }

    @Override
    public String toString() {
        return routeFromAToB;
    }
}
