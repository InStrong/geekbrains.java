package ru.geekbrains.java.lesson6;

public  abstract class Animal {


    protected Animal() {
    }



    protected  abstract void run(double distance);


    protected void swim(double distance) {
        System.out.println("swim: " + (distance <= 10));
    }

    protected void jump(double height) {
        System.out.println("jump: " + (height <= 0.5));

    }
}
