package ru.nikolaevvalentin.designPatterns.creational.builder.teamBuilders;

import ru.nikolaevvalentin.designPatterns.creational.builder.ProjectTeam;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.webSite.PhpDeveloper;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.webSite.PhpTester;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.webSite.SitePM;

public class WebProjectTeamBuilder implements TeamBuilder {
    private ProjectTeam projectTeam;

    public WebProjectTeamBuilder() {
        this.projectTeam = new ProjectTeam();
    }


    @Override
    public void setBusinessAnalytic() {

    }

    @Override
    public void setDeveloper() {
        projectTeam.addDeveloper(new PhpDeveloper(110_000));
    }

    @Override
    public void setTester() {
        projectTeam.addTester(new PhpTester(60_000));
    }

    @Override
    public void setProjectManager() {
        projectTeam.addManager(new SitePM(160_000));
    }

    @Override
    public ProjectTeam getTeam() {
        return projectTeam;
    }
}
