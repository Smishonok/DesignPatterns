package ru.nikolaevvalentin.designPatterns.creational.builder;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.*;

import java.util.ArrayList;
import java.util.List;

public class ProjectTeam {
    private List<Employee> teamMembers;

    public ProjectTeam() {
        teamMembers = new ArrayList<>();
    }

    public ProjectTeam addAnalytic(Analytic analytic) {
        teamMembers.add((Employee)analytic);
        return this;
    }

    public ProjectTeam addDeveloper(Developer developer) {
        teamMembers.add((Employee) developer);
        return this;
    }

    public ProjectTeam addTester(Tester tester) {
        teamMembers.add((Employee)tester);
        return this;
    }

    public ProjectTeam addManager(ProjectManager manager) {
        teamMembers.add((Employee) manager);
        return this;
    }

    public int  getTeamMonthSalary() {
        return teamMembers
                .stream()
                .map(Employee::getMonthSalary)
                .reduce(Integer::sum).orElse(0);
    }

    public void work() {
        teamMembers.forEach(Employee::work);
    }
}
