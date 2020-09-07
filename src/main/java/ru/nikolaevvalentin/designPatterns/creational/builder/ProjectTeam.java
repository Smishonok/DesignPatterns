package ru.nikolaevvalentin.designPatterns.creational.builder;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.*;

import java.util.ArrayList;
import java.util.List;

public class ProjectTeam {
    private List<Employ> teamMembers;

    public ProjectTeam() {
        teamMembers = new ArrayList<>();
    }

    public ProjectTeam addAnalytic(Analytic analytic) {
        teamMembers.add((Employ)analytic);
        return this;
    }

    public ProjectTeam addDeveloper(Developer developer) {
        teamMembers.add((Employ) developer);
        return this;
    }

    public ProjectTeam addTester(Tester tester) {
        teamMembers.add((Employ)tester);
        return this;
    }

    public ProjectTeam addManager(ProjectManager manager) {
        teamMembers.add((Employ) manager);
        return this;
    }

    public int  getTeamMonthSalary() {
        return teamMembers
                .stream()
                .map(Employ::getMonthSalary)
                .reduce(Integer::sum).orElse(0);
    }

    public void work() {
        teamMembers.forEach(Employ::work);
    }
}
