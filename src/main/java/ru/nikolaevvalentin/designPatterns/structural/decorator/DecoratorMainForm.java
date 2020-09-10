package ru.nikolaevvalentin.designPatterns.structural.decorator;

public class DecoratorMainForm {
    public static void main(String[] args) {
        GreetingsForm firstAppForm = new GreetingsForm();
        GreetingFormDecorator shopAppForm = new ShopGreetingsWinForm(firstAppForm);
        GreetingFormDecorator shopPresentationForm = new ShopPresentationWinForm(shopAppForm);
        shopPresentationForm.drawForm();
    }
}
