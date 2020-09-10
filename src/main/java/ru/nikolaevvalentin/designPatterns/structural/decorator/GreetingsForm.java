package ru.nikolaevvalentin.designPatterns.structural.decorator;

public class GreetingsForm implements WindowForm{

    @Override
    public void drawForm() {
        System.out.println("Greetings user!");
    }
}
