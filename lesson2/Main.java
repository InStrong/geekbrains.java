package ru.geekbrains.java.lesson2;

        import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // taskOne();
        // taskTwo();
        // taskThree();
        // taskFour();
        // taskFive();
        //  int [] arr={1,2,3,4,5,6,7,8,9};
        // System.out.println(taskSix(arr));
        //taskSeven(arr,8);
    }
    //Task_1
    public static void taskOne()
    {
        int arr[] = {0, 0, 1, 0, 1, 1, 1, 0, 1, 0};
        for (int i:arr) arr[i]=  (arr[i]==0) ? 1 : 0;
        System.out.println( Arrays.toString(arr));
    }
    //Task_2
    public static void taskTwo()
    {
        int[] arr = new int[8];
        for (int i=0;i<arr.length-1;i++) arr[i+1]=arr[i]+3;
        System.out.println( Arrays.toString(arr));
    }
    //Task_3
    public static void taskThree()
    {
        int arr[]={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0;i<arr.length;i++) if (arr[i]<6) arr[i]=arr[i]*2;
        System.out.println( Arrays.toString(arr));
    }
    //Task_4\
    public static void taskFour()
    {
        int[][] table = new int[4][4];
        for (int i=0;i<table.length;i++)
        {
            for (int j=0;j<table.length;j++)
            {
                if (i==j)
                {
                    table[i][j]=1;
                    table[i][table.length-i-1]=1;
                }
            }
        }
        //Printing the array
//            for (int[] i:table){
//                for (int j : i) {
//                    System.out.print(j+", ");
//                }
//                System.out.println();
//            }
    }
    //task_5
    private static void taskFive()
    {
        int[] arr={-5,1,54,0,13,1};
        int max=arr[0],min=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>max) max=arr[i];
            if (arr[i]<min) min=arr[i];
        }
        if (min==max) System.out.println("Все элементы массива одинаковы");

        System.out.println("Max = "+max);
        System.out.println("Min = "+min);

    }
    //task_6
    private static boolean taskSix(int arr[])
    {
        int check=arr[0];
        int sum=0;
        for (int i=0;i<arr.length;i++) //Сумма всех элементов
        {
            sum+=arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            if (check*2==sum) return true;
            check+=arr[i];
        }
        return false;

    }
    //task_7
    private static void taskSeven(int arr[],int n)
    {
        System.out.println("Оригинальный массив :");
        System.out.println(Arrays.toString(arr));
        System.out.println("Массив, смещенный на "+(n>0 ? n : -n) +" элемента(ов) "+ (n>0 ? "вправо :" : "влево :"));
        int temp;
        if (n>0)
        {
            while(n>0){
                temp=arr[arr.length-1];
                for (int i = arr.length-1; i >0 ; i--) {
                    arr[i]=arr[i-1];
                }
                arr[0]=temp;
                n--;}
        }
        else {
            n = Math.abs(n);
            while (n > 0) {
                temp = arr[0];
                for (int i = 0; i < arr.length-1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length-1]=temp;
                n--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}