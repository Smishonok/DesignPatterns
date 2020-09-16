package ru.nikolaevvalentin.designPatterns.behavioral.templateMethod;

public class WallClockMaintenance extends Maintenance {
    @Override
    protected void talkWithClient() {

    }

    @Override
    protected boolean isProblemDefinedByClient() {
        return false;
    }

    @Override
    protected void checkDefinedProblem() {

    }

    @Override
    protected boolean isProblemConfirmed() {
        return false;
    }

    @Override
    protected void getTotalDiagnostic() {
        System.out.println("Disassemble the clock and check the mechanical parts...");
    }

    @Override
    protected void fixProblem() {
        System.out.println("Fix the clock breakdown...");
    }
}
