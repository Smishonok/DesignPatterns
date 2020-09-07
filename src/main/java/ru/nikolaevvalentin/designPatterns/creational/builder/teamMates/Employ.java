package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates;

public abstract class Employ {

    private int monthSalary;

    public Employ(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getMonthSalary(){
        return monthSalary;
    }

    public abstract void work();
}
