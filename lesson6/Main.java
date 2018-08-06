package ru.geekbrains.java.lesson6;


public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog(300); // С новым ограничением на расстояние
        Dog dog2 = new Dog(); // Со стандартным ограничением(500)
        Cat cat1 = new Cat();

        dog1.run(500);
        dog2.run(500);
        cat1.run(20);

        dog1.swim(10);
        cat1.swim(0);

        dog1.jump(0.4);
        cat1.jump(1);

    }
}
