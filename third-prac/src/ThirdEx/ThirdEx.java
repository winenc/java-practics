package ThirdEx;
/* Пользователь должен ввести с клавиатуры размер массива -
         натуральное число больше, так чтобы введенное пользователем число
         сохранялось в переменную n. Если пользователь ввел не подходящее число, то
         программа должна просить пользователя повторить ввод. Создать массив из n
         случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй
         массив только из четных элементов первого массива, если они там есть, и
         вывести его на экран.
         */

import java.util.Scanner;

public class ThirdEx {
    int n;
    int[] arr;
    int[] chetArr;
    public ThirdEx()
    {
        Scanner in = new Scanner(System.in);
        String str;
        boolean flag = true;
        do
        {
            flag = true;
            System.out.print("Введите натуральное число, размер массива: ");
            this.n = in.nextInt();
            if(n <= 0) {
                System.out.println("Ошибка ввода.");
                flag = false;
            }
        }while (!flag);
        arr = new int[n];
        int countChet = 0;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Math.abs((int)(Math.random()*(this.n+1)));
        }

        for(int var: arr)
        {
            if(var%2 == 0) countChet++;
        }
        if(countChet != 0) {
            chetArr = new int[countChet];
            countChet = 0;
            for (int var : arr) {
                if (var % 2 == 0) chetArr[countChet++] = var;
            }
        }
        else
        {
            chetArr = new int[0];
        }
    }

    public void displayArr()
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public void displayChetArr()
    {
        for (int j : chetArr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public void start()
    {
        this.displayArr();
        this.displayChetArr();

    }

}
