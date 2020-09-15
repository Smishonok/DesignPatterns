package ru.nikolaevvalentin.designPatterns.behavioral.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class Stuff {

    Map<Integer, Employee> employees = new HashMap<>();

    public void add(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public Iterator<Employee> managersIterator() {
        return employees
                .values()
                .stream()
                .filter(employee->employee
                        .getType()
                        .equals(EmployeeType.MANAGER))
                .collect(Collectors.toList())
                .iterator();
    }

    public Iterator<Employee> engineerIterator() {
        return employees
                .values()
                .stream()
                .filter(employee->employee
                        .getType()
                        .equals(EmployeeType.ENGINEER))
                .collect(Collectors.toList())
                .iterator();
    }

    public Iterator<Employee> iterator() {
        return employees
                .values()
                .iterator();
    }
}
