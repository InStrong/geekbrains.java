package ru.geekbrains.java.lesson6;


public class Cat extends Animal {
    @Override
    protected void run(double distance) {
        System.out.println("run: " + (distance <= 200));
    }

    @Override
    protected void swim(double distance) {
        System.out.println("swim: " + (distance == 0));
    }

    @Override
    protected void jump(double height) {
        System.out.println("jump: " + (height <= 2));
    }
}
