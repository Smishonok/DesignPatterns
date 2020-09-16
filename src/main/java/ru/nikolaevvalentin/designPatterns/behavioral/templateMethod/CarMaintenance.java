package ru.nikolaevvalentin.designPatterns.behavioral.templateMethod;

public class CarMaintenance extends Maintenance {
    private boolean isProblemDefined = false;
    private boolean isProblemConfirmed = true;

    @Override
    protected void talkWithClient() {
        System.out.println("Ask the car`s owner about car breakdown...");
        isProblemDefined = ! isProblemDefined;
    }

    @Override
    protected boolean isProblemDefinedByClient() {
        return isProblemDefined;
    }

    @Override
    protected void checkDefinedProblem() {
        System.out.println("Check car breakdown, which defined by car`s owner...");
        isProblemConfirmed = ! isProblemConfirmed;
    }

    @Override
    protected boolean isProblemConfirmed() {
        return isProblemConfirmed;
    }

    @Override
    protected void getTotalDiagnostic() {
        System.out.println("Make total car diagnostic...");
    }

    @Override
    protected void fixProblem() {
        System.out.println("Repair the car...");
    }
}
