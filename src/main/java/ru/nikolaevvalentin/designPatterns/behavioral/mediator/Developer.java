package ru.nikolaevvalentin.designPatterns.behavioral.mediator;

public class Developer {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void startCodeMaking() {
        System.out.println("Developer: begin coding...");
    }

    public String getCode() {
        return "New super fast client microservice";
    }
}
