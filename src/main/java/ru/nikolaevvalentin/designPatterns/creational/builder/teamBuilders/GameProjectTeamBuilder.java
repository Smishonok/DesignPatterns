package ru.nikolaevvalentin.designPatterns.creational.builder.teamBuilders;

import ru.nikolaevvalentin.designPatterns.creational.builder.ProjectTeam;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.gameDev.CppDeveloper;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.gameDev.CppTester;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.gameDev.GamePM;

public class GameProjectTeamBuilder implements TeamBuilder {
    private ProjectTeam projectTeam;

    public GameProjectTeamBuilder() {
        this.projectTeam = new ProjectTeam();
    }

    @Override
    public void setBusinessAnalytic() {

    }

    @Override
    public void setDeveloper() {
        projectTeam.addDeveloper(new CppDeveloper(200_000));
    }

    @Override
    public void setTester() {
        projectTeam.addTester(new CppTester(80_000));
    }

    @Override
    public void setProjectManager() {
        projectTeam.addManager(new GamePM(350_000));
    }

    @Override
    public ProjectTeam getTeam() {
        return projectTeam;
    }
}
