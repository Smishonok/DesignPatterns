package ru.nikolaevvalentin.designPatterns.structural.decorator;

public class ShopPresentationWinForm extends GreetingFormDecorator {
    public ShopPresentationWinForm(WindowForm windowForm) {
        super(windowForm);
    }

    @Override
    public void drawForm() {
        super.drawForm();
        System.out.println("Today in our shop will be present new Nvidea video card!");
    }
}
