package ru.nikolaevvalentin.designPatterns.behavioral.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        mediator.setManager(new Manager());
        mediator.setDeveloper(new Developer());
        mediator.setMarketer(new Marketer());
        mediator.setEngineer(new Engineer());
        mediator.setTeamLead(new TeamLead());

        mediator.requestNewFuture();

    }
}
