package ru.nikolaevvalentin.designPatterns.creational.builder.teamBuilders;

import ru.nikolaevvalentin.designPatterns.creational.builder.ProjectTeam;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.banking.BankingPM;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.banking.BusinessAnalytic;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.banking.JavaDeveloper;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.banking.JavaTester;

public class BankingTeamBuilder implements TeamBuilder {

    private ProjectTeam projectTeam;

    public BankingTeamBuilder() {
        this.projectTeam = new ProjectTeam();
    }

    @Override
    public void setBusinessAnalytic() {
        projectTeam.addAnalytic(new BusinessAnalytic(90_000));
    }

    @Override
    public void setDeveloper() {
        projectTeam.addDeveloper(new JavaDeveloper(100_000));
    }

    @Override
    public void setTester() {
        projectTeam.addTester(new JavaTester(60_000));
    }

    @Override
    public void setProjectManager() {
        projectTeam.addManager(new BankingPM(150_000));
    }

    @Override
    public ProjectTeam getTeam() {
        return projectTeam;
    }
}
