package ru.nikolaevvalentin.designPatterns.behavioral.visitor;

public class PsychiatristHelp implements Visitor {
    @Override
    public void managerHelpRequest() {
        System.out.println("Manager do not need help.");
    }

    @Override
    public void developerHelpRequest() {
        System.out.println("Developer unstable and need psychiatrist help!!!!");
    }

    @Override
    public void teamLeadHelpRequest() {
        System.out.println("Team lead like Hulk, he is always mad!");
    }

    @Override
    public void engineerHelpRequest() {

    }
}
