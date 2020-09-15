package ru.nikolaevvalentin.designPatterns.behavioral.state;

public class TeamLead {

    private String state = "nice";

    public void reviewDevelopersCode() {
        switch (state) {
            case "nice":
                System.out.println("Team lead smiles and whistles a melody cheerfully...");
                state = "anxious";
                break;
            case "anxious":
                System.out.println("Team lead sits gloomy in the office...");
                state = "nervous";
                break;
            case "nervous":
                System.out.println("Team lead walks from corner to corner...");
                state = "angry";
                break;
            case "angry":
                System.out.println("Team lead cry, yell at employees, throws telephones...");
                state = "nice";
                break;
        }
    }
}
