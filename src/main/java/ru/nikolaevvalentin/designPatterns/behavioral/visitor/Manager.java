package ru.nikolaevvalentin.designPatterns.behavioral.visitor;

public class Manager implements Help {

    private Visitor visitor;

    public Manager(Visitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public void getHelp() {
        visitor.managerHelpRequest();
    }
}
