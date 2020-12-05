package com.eldus;

public class Main {

    public static void main(String[] args) {
        int[] k = {1, 2};
        Employee e1 = new Employee("Артем", "Деревянко");
        Employee e2 = new Employee("Кристина", "Асмус", 200);
        e1.print();
        e2.print();
        System.out.println("_____________");
        Manager m1 = new Manager("Катерина", "Костенко", new int[]{e1.id, e2.id});
        m1.print();
        Employee e3 = new Employee("Андрей", "Лазуренко", 3000);
        Manager m2 = new Manager("Николь", "Дорожко", new int[]{3});
        m2.print();
    }
}
