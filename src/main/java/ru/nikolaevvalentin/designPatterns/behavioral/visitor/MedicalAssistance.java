package ru.nikolaevvalentin.designPatterns.behavioral.visitor;

public class MedicalAssistance implements Visitor {
    @Override
    public void managerHelpRequest() {
        System.out.println("Manager need medical assistance!");
    }

    @Override
    public void developerHelpRequest() {
        System.out.println("Developer need medical assistance!");
    }

    @Override
    public void teamLeadHelpRequest() {
        System.out.println("Team lead need medical assistance!");
    }

    @Override
    public void engineerHelpRequest() {
        System.out.println("Engineer need medical assistance!");
    }
}
