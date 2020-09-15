package ru.nikolaevvalentin.designPatterns.behavioral.chainOfResponsibility;

public abstract class Repairer {

    private Repairer nextRepairer;

    public Repairer() {
    }

    public Repairer(Repairer nextRepairer) {
        this.nextRepairer = nextRepairer;
    }

    public final void repair (String nameOfThing) {
        if (isCanBeRepairableByThisRepairer(nameOfThing)) {
            repairThing(nameOfThing);
        } else {
            getNextHandler(nameOfThing);
        }
    }

    protected abstract void repairThing(String nameOfThing);

    protected abstract boolean isCanBeRepairableByThisRepairer(String nameOfThing);

    private void getNextHandler(String nameOfThing) {
        if (nextRepairer != null) {
            nextRepairer.repair(nameOfThing);
        } else {
            System.out.println("Repairers can`t repair this thing!");
        }
    }

}
