package ru.nikolaevvalentin.designPatterns.creational.builder;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamBuilders.GameProjectTeamBuilder;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamBuilders.WebProjectTeamBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new WebProjectTeamBuilder());
        ProjectTeam projectTeam = director.make();
        projectTeam.work();
        System.out.println("Team month salary:" + projectTeam.getTeamMonthSalary());
    }



}
