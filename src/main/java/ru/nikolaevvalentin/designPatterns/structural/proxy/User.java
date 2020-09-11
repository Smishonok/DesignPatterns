package ru.nikolaevvalentin.designPatterns.structural.proxy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {

    private static int lastUserId=0;

    {
        lastUserId++;
    }


    private int id;
    private String name;
    private LocalDateTime birthDay;

    public User(String name) {
        this.id   = lastUserId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        return birthDay.format(formatter);
    }

    public void setBirthDay(int day, int month, int year) {
        this.birthDay = LocalDateTime.of(year,month,day,0,0);
    }
}
