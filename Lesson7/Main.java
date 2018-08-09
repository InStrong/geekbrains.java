package Lesson7;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Рыжик", 10, false);
        allCats[1] = new Cat("Барсик", 5, false);
        allCats[2] = new Cat("Пёс", 25, false);
        allCats[3] = new Cat("Снежок", 20, false);


        Plate plate = new Plate(46);
        plate.info();
        do {
            feeding(allCats, plate);


        } while (!checkIfSatiety(allCats, plate));
        System.out.println("Все сыты");
    }

    private static void feeding(Cat[] allCats,Plate plate)
    {
        for (int i = 0; i < allCats.length; i++) {
            if (!allCats[i].satiety && allCats[i].appetite <= plate.food) {
                allCats[i].eat(plate);
                allCats[i].satiety = true;
                System.out.println(allCats[i].name + " поел!");
            } else {
                if (allCats[i].satiety) System.out.println(allCats[i].name + " уже сыт!");
                else System.out.println(allCats[i].name + " не поел!");
            }
        }
    }
    private static boolean checkIfSatiety(Cat[] allCats,Plate plate)
    {
        int allAppetite = 0;
        for (int i = 0; i < allCats.length; i++) {
            if (!allCats[i].satiety) allAppetite += allCats[i].appetite;
        }
        if (allAppetite <=plate.food) return true;
        if (allAppetite > plate.food) {
            System.out.println("Мы не накормили всех котов. Надо добавить еды!");
        }
        plate.info();
        System.out.println("Сколько порций еды добавить в тарелку?");
        plate.addFood(sc.nextInt());
        plate.info();
        return false;
    }

}
