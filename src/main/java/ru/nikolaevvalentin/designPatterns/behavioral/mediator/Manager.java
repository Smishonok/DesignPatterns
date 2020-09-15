package ru.nikolaevvalentin.designPatterns.behavioral.mediator;

public class Manager {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setNewTask() {
        System.out.println("Manager: analise client request...");
        System.out.println("Manager: request market research...");
        mediator.getMarketResearch();
        System.out.println("Manager: set new task for team lead...");
        mediator.setNewDevelopmentTask();
    }
}
