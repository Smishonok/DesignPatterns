package ru.nikolaevvalentin.designPatterns.behavioral.visitor;

public class TeamLead implements Help {
    private Visitor visitor;

    public TeamLead(Visitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public void getHelp() {
        visitor.teamLeadHelpRequest();
    }
}
