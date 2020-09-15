package ru.nikolaevvalentin.designPatterns.behavioral.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Navigator navigator = new Navigator("Vavilovih Str.", "Nevsciy Av.");
        navigator.setRouteForCarMaker();
        System.out.println(navigator.getRoute());

        navigator.setPointA("Zenchikov Str.");
        navigator.setWalkingRouteMaker();
        System.out.println(navigator.getRoute());
    }

}
