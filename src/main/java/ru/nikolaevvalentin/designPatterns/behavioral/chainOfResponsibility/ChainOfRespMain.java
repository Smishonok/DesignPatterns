package ru.nikolaevvalentin.designPatterns.behavioral.chainOfResponsibility;

public class ChainOfRespMain {
    public static void main(String[] args) {
        Repairer repairer = new Shoemaker(new Seamstress());
        repairer.repair("shoes");
        repairer.repair("clothes");
        repairer.repair("car");
    }
}
