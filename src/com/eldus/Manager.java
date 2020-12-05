package com.eldus;

import javax.swing.*;

public class Manager extends Employee {
    int[] subordinates;

    Manager(String name, String surname, int[] subordinates) {
        super(name, surname);
        this.subordinates = subordinates;
    }

    Manager(String name, String surname, int salary, int[] subordinates) {
        super(name, surname, salary);
        this.subordinates = subordinates;
    }

    @Override
    public void print() {
        super.print();
        System.out.print("Id:");
        for (int empl : subordinates) {
            System.out.print(" " + empl);
        }
        System.out.println();
    }
}
