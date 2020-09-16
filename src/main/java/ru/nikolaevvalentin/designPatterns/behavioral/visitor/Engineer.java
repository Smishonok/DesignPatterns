package ru.nikolaevvalentin.designPatterns.behavioral.visitor;

public class Engineer implements Help {
    private Visitor visitor;

    public Engineer(Visitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public void getHelp() {
        visitor.engineerHelpRequest();
    }
}
