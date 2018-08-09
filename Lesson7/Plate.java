package Lesson7;

public class Plate {
    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    public void addFood(int add) {
        food += add;
    }

    public void eatFood(int eat) {
        food -= eat;
    }

    public void info() {
        System.out.println("Всего еды: " + food);
    }
}
