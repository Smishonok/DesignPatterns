package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates;

public abstract class Employee {

    private int monthSalary;

    public Employee(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getMonthSalary(){
        return monthSalary;
    }

    public abstract void work();
}
