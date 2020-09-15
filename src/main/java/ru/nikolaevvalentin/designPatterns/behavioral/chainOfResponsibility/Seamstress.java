package ru.nikolaevvalentin.designPatterns.behavioral.chainOfResponsibility;

public class Seamstress extends Repairer {
    public Seamstress() {
    }

    public Seamstress(Repairer nextRepairer) {
        super(nextRepairer);
    }

    @Override
    protected void repairThing(String nameOfThing) {
        System.out.println("Seamstress: Repair " + nameOfThing + "...\nSeamstress: done!");
    }

    @Override
    protected boolean isCanBeRepairableByThisRepairer(String nameOfThing) {
        return nameOfThing.toLowerCase().equals("clothes");
    }
}
