package ru.nikolaevvalentin.designPatterns.behavioral.visitor;

public class Developer  implements Help{
    private Visitor visitor;

    public Developer(Visitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public void getHelp() {
        visitor.developerHelpRequest();
    }
}
