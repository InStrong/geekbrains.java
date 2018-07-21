package ru.geekbrains.java.lesson3;


import java.util.Scanner;
import java.util.Random;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {

        //gameOne();
        //gameTwo();

    }

    private static void gameOne() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(10);
        int check = 0;
        int playMore = 1;
        while (playMore != 0) {
            System.out.println("Число загадано!");
            for (int i = 3; i > 0; i--) {
                System.out.println("У вас " + (i == 1 ? "осталась " : "остались ") + i + (i == 1 ? " попытка" : " попытки"));
                System.out.print("Введите число: ");
                check = scanner.nextInt();
                if (check == answer) break;
                System.out.println("Ваше число " + (check > answer ? "БОЛЬШЕ " : "МЕНЬШЕ ") + "чем загаданное");
            }
            System.out.println("Вы " + (check == answer ? "выиграли!" : "проиграли..."));
            System.out.println("Повторить игру еще раз?  1 - да; 0 - нет");
            playMore = scanner.nextInt();
        }
    }

    private static void gameTwo() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String check;                               //Строка, которую вводит игрок
        StringBuilder test = new StringBuilder("###############");
        int hashtagCount = 0;                       //Переменная, которая определит сколько букв угадано
        int answer = random.nextInt(words.length - 1);  // Выбрали случайно слово
        System.out.println("Слово загадано");
        System.out.print("Введите слово: ");
        String wordCopy = words[answer];
        int wordLength = words[answer].length();
        for (int i = 0; i < (15 - wordLength); i++) {
            words[answer] = words[answer] + "#";
        }
        while (hashtagCount != (15 - wordLength)) {
            check = scanner.nextLine();
            for (int i = 0; i < check.length(); i++) {
                if (check.charAt(i) == words[answer].charAt(i))
                    test.setCharAt(i, words[answer].charAt(i));
                else test.setCharAt(i, '#');
            }
            hashtagCount = 0;
            for (int i = 0; i < test.length(); i++)       //Подсчет угаданных букв
            {
                if (test.charAt(i) == '#') hashtagCount++;
            }
            System.out.println(test);
            System.out.println("Пробуйте еще, слово не отгадано");
        }
        System.out.println("Слово " + wordCopy.toUpperCase() + " отгадано!");

    }
}
