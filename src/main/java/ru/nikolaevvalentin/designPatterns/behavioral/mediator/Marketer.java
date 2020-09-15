package ru.nikolaevvalentin.designPatterns.behavioral.mediator;

public class Marketer {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void getMarketResearch() {
        System.out.println("Marketer: making market research...");
    }
}
