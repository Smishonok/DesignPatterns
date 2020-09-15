package ru.nikolaevvalentin.designPatterns.behavioral.iterator;

public class Employee {

    private static int lastId = 0;
    private int id;
    private String firstName;
    private String lastName;
    private EmployeeType type;

    public Employee(String firstName, String lastName, EmployeeType type) {
        this.id        = ++lastId;
        this.firstName = firstName;
        this.lastName  = lastName;
        this.type      = type;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public EmployeeType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" +
               lastName + '\'' + ", type=" + type + '}';
    }
}
