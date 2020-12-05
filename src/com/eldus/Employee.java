package com.eldus;

public class Employee {
    int id;
    String name;
    String surname;
    int salary;

    static int numberOfEmployees = 0;

    Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        id = numberOfEmployees;
        numberOfEmployees++;
    }

    Employee(String name, String surname, int salary) {
        this(name, surname);
        this.salary = salary;
    }

    public void print() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(surname);
        System.out.println(salary);
    }
}
