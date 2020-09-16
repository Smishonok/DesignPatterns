package ru.nikolaevvalentin.designPatterns.behavioral.visitor;

public interface Visitor {

    void managerHelpRequest();

    void developerHelpRequest();

    void teamLeadHelpRequest();

    void engineerHelpRequest();
}
