package ru.nikolaevvalentin.designPatterns.behavioral.chainOfResponsibility;

public class Shoemaker extends Repairer {
    public Shoemaker() {
    }

    public Shoemaker(Repairer nextRepairer) {
        super(nextRepairer);
    }

    @Override
    protected void repairThing(String nameOfThing) {
        System.out.println("ShoeMaker: Repair "+ nameOfThing+"...\nShoeMaker: done!");
    }

    @Override
    protected boolean isCanBeRepairableByThisRepairer(String nameOfThing) {
        return nameOfThing.toLowerCase().equals("shoes");
    }
}
