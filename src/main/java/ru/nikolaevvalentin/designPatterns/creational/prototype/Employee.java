package ru.nikolaevvalentin.designPatterns.creational.prototype;

public class Employee extends Person {

    private String position;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Employee(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }

    protected Employee(Employee employee) {
        super(employee);
        this.position = employee.position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public Employee clone() {
        return new Employee(this);
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName='" + getFirstName() + '\'' + ", lastName='" + getLastName() + '\'' +
               ", birthDay=" + getBirthDay() + ", position=" + getPosition() + '}';
    }

    public static class EmployeeBuilder {
        private Employee employee;

        public EmployeeBuilder() {
            this.employee = new Employee("undefined", "undefined");
        }

        public EmployeeBuilder(Employee employee) {
            this.employee = employee;
        }

        public EmployeeBuilder(String firstName, String lastName) {
            this.employee = new Employee(firstName, lastName);
        }

        public EmployeeBuilder setFirstName(String firstName) {
            this.employee.setFirstName(firstName);
            return this;
        }

        public EmployeeBuilder setLastName(String lastName) {
            this.employee.setLastName(lastName);
            return this;
        }

        public EmployeeBuilder setBirthDay(int day, int month, int year) {
            employee.setBirthDay(day,month,year);
            return this;
        }

        public EmployeeBuilder setPosition(String position) {
            this.employee.setPosition(position);
            return this;
        }

        public Employee build() {
            return employee;
        }
    }


}
