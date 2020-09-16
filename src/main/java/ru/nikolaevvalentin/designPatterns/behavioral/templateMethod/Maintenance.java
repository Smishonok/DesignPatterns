package ru.nikolaevvalentin.designPatterns.behavioral.templateMethod;

public abstract class Maintenance {

    public final void getMaintenanceSchedule() {
        talkWithClient();
        if (isProblemDefinedByClient()) {
            checkDefinedProblem();
        }

        if (!isProblemConfirmed()) {
            getTotalDiagnostic();
        }
        fixProblem();
    }

    protected abstract void talkWithClient();

    protected abstract boolean isProblemDefinedByClient();

    protected abstract void checkDefinedProblem();

    protected abstract boolean isProblemConfirmed();

    protected abstract void getTotalDiagnostic();

    protected abstract void fixProblem();
}
