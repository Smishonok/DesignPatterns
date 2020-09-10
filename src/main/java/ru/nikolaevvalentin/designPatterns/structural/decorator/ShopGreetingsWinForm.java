package ru.nikolaevvalentin.designPatterns.structural.decorator;

public class ShopGreetingsWinForm extends GreetingFormDecorator {
    public ShopGreetingsWinForm(WindowForm windowForm) {
        super(windowForm);
    }

    @Override
    public void drawForm() {
        super.drawForm();
        System.out.println("Our shop glad to see you again!");
    }
}
