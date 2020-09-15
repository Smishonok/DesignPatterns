package ru.nikolaevvalentin.designPatterns.behavioral.mediator;

public class TeamLead {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }


    public void setNewTask() {
        System.out.println("Team lead: planing new case and set new tasks to the developer...");
        mediator.startCodeMaking();
        System.out.println(
                "Team lead: review code and give it to the engineer to deploy on " + "server...");
        mediator.deployNewClientMicroService(mediator.getCodeForReview());
    }


}
