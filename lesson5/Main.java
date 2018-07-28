package ru.geekbrains.java.lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Serj Tankian", "vocals", "tankian@gmail.com", "88005550001", 45000, 30);
        employeesArray[1] = new Employee("John Lennon", "vocals", "lennon@mail.ru", "88005550002", 88500, 42);
        employeesArray[2] = new Employee("Paul McCartney", "bass guitar", "McCartney@mail.ru", "88005550003", 10000, 55);
        employeesArray[3] = new Employee("George Harrison", "rhythm guitar", "Harrison@yandex.ru", "88005550004", 57000, 39);
        employeesArray[4] = new Employee("Ringo Starr", "drums", "Starr@mail.ru", "88005550005", 88000, 75);
        for (int i=0;i<employeesArray.length;i++)
        {
            if (employeesArray[i].getAge()>40) employeesArray[i].printInfo();
        }
    }
}
