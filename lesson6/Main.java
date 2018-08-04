package ru.geekbrains.java.lesson6;


public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        dog1.run(500);
        cat1.run(2.0);

        dog1.swim(10);
        cat1.swim(0);

        dog1.jump(0.4);
        cat1.jump(1);

    }
}
