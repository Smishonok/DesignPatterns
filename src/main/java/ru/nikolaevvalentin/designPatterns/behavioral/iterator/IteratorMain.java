package ru.nikolaevvalentin.designPatterns.behavioral.iterator;

import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        Stuff stuff = new Stuff();

        stuff.add(new Employee("Alesand", "Morkvin", EmployeeType.ENGINEER));
        stuff.add(new Employee("Anita","Golovkina",EmployeeType.MANAGER));
        stuff.add(new Employee("Floriana", "Ginz", EmployeeType.MANAGER));
        stuff.add(new Employee("Gregory", "Mashura", EmployeeType.TOP_EXECUTIVE));
        stuff.add(new Employee("Arkady", "Frolov", EmployeeType.ENGINEER));


        forEach(stuff.iterator());


    }


    private static void forEach(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
