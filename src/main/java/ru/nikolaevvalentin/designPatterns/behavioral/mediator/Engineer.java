package ru.nikolaevvalentin.designPatterns.behavioral.mediator;

public class Engineer {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void deployMicroService(String microservice) {
        System.out.println("Engineer: deploying \"" + microservice+"\"...");
    }
}
