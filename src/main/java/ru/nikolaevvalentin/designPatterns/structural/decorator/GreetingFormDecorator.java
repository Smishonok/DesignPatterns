package ru.nikolaevvalentin.designPatterns.structural.decorator;

public class GreetingFormDecorator implements WindowForm {

    private WindowForm windowForm;

    public GreetingFormDecorator(WindowForm windowForm) {
        this.windowForm = windowForm;
    }

    @Override
    public void drawForm() {
        windowForm.drawForm();
    }
}
