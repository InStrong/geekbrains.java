package ru.geekbrains.java.lesson5;

public class Employee {

    private String fullName;
    private String function;
    private String eMail;
    private String phone;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String fullName, String function, String eMail, String phone, int salary, int age) {
        this.fullName = fullName;
        this.function = function;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo()
    {
        System.out.println("Name: "+fullName+" | Function: "+function+" | e-mail: "+eMail+" | phone: "+phone+" | salary: "+salary+" | age: "+age);
    }


}
