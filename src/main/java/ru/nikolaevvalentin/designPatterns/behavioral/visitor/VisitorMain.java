package ru.nikolaevvalentin.designPatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorMain {
    public static void main(String[] args) {
        Visitor assistence = new PsychiatristHelp();
        List<Help> helpList = new ArrayList<>();
        helpList.add(new Developer(assistence));
        helpList.add(new TeamLead(assistence));
        helpList.add(new Manager(assistence));
        helpList.add(new Engineer(assistence));

        helpList.forEach(Help::getHelp);
    }
}
