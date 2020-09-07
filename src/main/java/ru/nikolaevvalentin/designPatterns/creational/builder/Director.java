package ru.nikolaevvalentin.designPatterns.creational.builder;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamBuilders.TeamBuilder;

public class Director {

    private TeamBuilder builder;

    public Director(TeamBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(TeamBuilder builder) {
        this.builder = builder;
    }

    public ProjectTeam make() {
        builder.setBusinessAnalytic();
        builder.setDeveloper();
        builder.setTester();
        builder.setProjectManager();
        return builder.getTeam();
    }
}
