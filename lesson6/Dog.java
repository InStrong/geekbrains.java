package ru.geekbrains.java.lesson6;


public class Dog extends Animal {



    private double maxRun=500;

    public Dog(double maxRun) {
        this.maxRun = maxRun;
    }

    public Dog() {
    }
    @Override
    protected void run(double distance) {
        System.out.println("run: " + (distance <= maxRun));
    }
}
