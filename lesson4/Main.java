package ru.geekbrains.java.lesson4_X_O;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static final int size=fieldSize();
    private static char[][] field = new char[size][size];
    private static Random random = new Random();


    public static void main(String[] args) {

        initMap();
        if (size<=3) System.out.println(size+" подряд для победы");
        else System.out.println(size-1+" подряд для победы");
        printMap();
        while (true) {
            move();
            printMap();
            if (checkIfWon('X'))
            {
                System.out.println("Выиграл игрок");
                break;
            }
            if (fieldIsFull()) break;
            aiMove();
            printMap();
            if (checkIfWon('O'))
            {
                System.out.println("Выиграл компьютер");
                break;
            }
            if (fieldIsFull()) break;
        }
        System.out.println("Game Is Over");
    }
    private static int fieldSize()
    {
        System.out.print("Введите размер поля: ");
        return sc.nextInt();

    }

    private static void initMap()
    {

        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++)
            {
                field[i][j]='*';
            }
        }
    }

    private static void printMap()
    {

        for (int k=0;k<size+1;k++)
            System.out.print(k+" ");
        System.out.println();
        for (int i=0;i<size;i++)
        {
            System.out.print((i+1)+" ");
            for (int j=0;j<size;j++)
            {
                System.out.print(field[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
    }

    private static void move()
    {
        int x,y;

        do {
            System.out.println("Введите координате в формате X и Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while(!correctmove(x,y));

        field[y][x] = 'X';



    }
    private static void aiMove()
    {
        int x,y;

        do {

            x = random.nextInt(size);
            y = random.nextInt(size);
        }
        while(!correctmove(x,y));

        field[y][x] = 'O';

    }
    private static boolean correctmove(int x, int y)
    {
        if (x>size-1 || x<0 || y>size-1 || y<0) return false;
        else if (field[y][x]=='X' || field[y][x]=='O') return false;
        return true;
    }
    private static boolean fieldIsFull()
    {
        for (int i=0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                if (field[i][j] == '*') return false;
            }
        }
        return true;
    }
    private static boolean checkIfWon(char c)
    {
        for (int i = 0; i < size; i++) {                //ПОБЕДА ПО ГОРИЗОНТАЛИ
            int hits = 0;

            for (int j = 0; j < size - 1; j++) {
                if ((field[i][j] == field[i][j + 1]) && (field[i][j] == c)) hits++;

            }
            if (size <= 3) {
                if (hits == size - 1) return true;
            } else if (hits == size - 2) return true;
        }
        for (int j = 0; j < size; j++) {                //ПОБЕДА ПО ВЕРТИКАЛИ
            int hits = 0;

            for (int i = 0; i < size - 1; i++) {
                if ((field[i][j] == field[i + 1][j]) && (field[i][j] == c)) hits++;

            }
            if (size <= 3) {
                if (hits == size - 1) return true;
            } else if (hits == size - 2) return true;
        }
        for (int i = 0; i < size-1; i++)               // ПРОВЕРКА ДИАГОНАЛИ "\"
        {
            int hits=0,hits2=0;
            int j=0;
            int temp=i;
            for (int k=0;k<size-i-1;k++)
            {
                if ((field[temp][j] == field[temp + 1][j+1]) && (field[temp][j] == c)) hits++;
                if ((field[j][temp] == field[j + 1][temp+1]) && (field[j][temp] == c)) hits2++;
                temp++;j++;
            }
            if (size <= 3) {
                if ((hits == size - 1) || (hits2 == size - 1)) return true;
            } else if ((hits == size - 2) || (hits2 == size - 2))return true;

        }
        for (int i = 0; i<size-1;i++)               // ПРОВЕРКА ДИАГОНАЛИ "\"
        {
            int hits=0,hits2=0;
            int j=size-1;
            int temp=i;
            for (int k=0;k<size-i-1;k++)
            {
                if ((field[temp][j] == field[temp + 1][j-1]) && (field[temp][j] == c)) hits++;    //правее главной
                if ((field[size-j-1][size-temp-1] == field[size-j-1 + 1][size-temp-1-1]) && (field[size-j-1][size-temp-1] == c)) hits2++; //левее главной
                temp++;j--;
            }
            if (size <= 3) {
                if ((hits == size - 1) || (hits2 == size - 1)) return true;
            } else if ((hits == size - 2) || (hits2 == size - 2))return true;

        }



        return false;
    }


}