package ru.nikolaevvalentin.designPatterns.behavioral.mediator;

public class Mediator {

    private Developer developer;
    private Manager manager;
    private Marketer marketer;
    private Engineer engineer;
    private TeamLead teamLead;

    public void setDeveloper(Developer developer) {
        this.developer = developer;
        this.developer.setMediator(this);
    }

    public void setManager(Manager manager) {
        this.manager = manager;
        this.manager.setMediator(this);
    }

    public void setMarketer(Marketer marketer) {
        this.marketer = marketer;
        this.marketer.setMediator(this);
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
        this.engineer.setMediator(this);
    }

    public void setTeamLead(TeamLead teamLead) {
        this.teamLead = teamLead;
        this.teamLead.setMediator(this);
    }

    public void startCodeMaking() {
        developer.startCodeMaking();
    }

    public String getCodeForReview() {
        return developer.getCode();
    }

    public void setNewDevelopmentTask() {
        teamLead.setNewTask();
    }

    public void getMarketResearch() {
        marketer.getMarketResearch();
    }

    public void requestNewFuture() {
        manager.setNewTask();
    }

    public void deployNewClientMicroService(String microService) {
        engineer.deployMicroService(microService);
    }
}
