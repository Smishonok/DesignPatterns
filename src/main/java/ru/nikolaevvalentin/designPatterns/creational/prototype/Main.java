package ru.nikolaevvalentin.designPatterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder("Valentin", "Nikolaev")
                .setBirthDay(22, 10, 1986)
                .setPosition("Manager")
                .build();
        Employee employeeClone = employee.clone();
        employeeClone.setFirstName("NonValentin");
        employeeClone.setBirthDay(10,12,2020);

        System.out.println(employee);
        System.out.println(employeeClone);
    }
}
