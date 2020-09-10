package ru.nikolaevvalentin.designPatterns.creational.prototype;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Person implements Cloneable {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDay;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");



    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    protected Person(Person person) {
        this.firstName = person.firstName;
        this.lastName = person.lastName;
        this.birthDay = LocalDateTime.of(person.birthDay.toLocalDate(),person.birthDay.toLocalTime());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDay() {
        return birthDay.format(formatter);
    }

    public void setBirthDay(int day, int month, int year) {
        this.birthDay = LocalDateTime.of(year, month, day, 0, 0);
    }

    @Override
    public Person clone() {
        return new Person(this);
    }

    @Override
    public String toString() {
        return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' +
               ", birthDay=" + birthDay + ", formatter=" + formatter + '}';
    }
}
