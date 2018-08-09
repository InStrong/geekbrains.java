package Lesson7;

public class Cat {

    protected String name;
    protected int appetite;
    protected boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate food) {
        food.eatFood(appetite);
    }


}
