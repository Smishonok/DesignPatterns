package ru.nikolaevvalentin.designPatterns.creational.builder.teamBuilders;

import ru.nikolaevvalentin.designPatterns.creational.builder.ProjectTeam;

public interface TeamBuilder {

    void setBusinessAnalytic();

    void setDeveloper();

    void setTester();

    void setProjectManager();

    ProjectTeam getTeam();

}
