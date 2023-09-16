package ThirdEx;
/* Пользователь должен ввести с клавиатуры размер массива -
         натуральное число больше, так чтобы введенное пользователем число
         сохранялось в переменную n. Если пользователь ввел не подходящее число, то
         программа должна просить пользователя повторить ввод. Создать массив из n
         случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй
         массив только из четных элементов первого массива, если они там есть, и
         вывести его на экран.
         */

import java.util.ArrayList;
import java.util.List;
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
            str = in.nextLine();
            if(!checkInt(str)) {
                str = "-1";

            }
            if((Integer.parseInt(str) < 0)) {
                System.out.println("Ошибка ввода.");
                str = "0";
                flag = false;
            }
            if((Integer.parseInt(str) == 0)) {
                System.out.println("Массив не будет создан");
                flag = false;
            }
        }while (!flag);
        this.n = Integer.parseInt(str);
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

    private static boolean recursiveCheckNum(String str)
    {

        boolean flag = false;
        char[] num = {'.', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        if(str.length() == 1) {
            for (char c:num) {
                if(c == str.charAt(0)) {
                    return true;
                }
            }
        }

        if(!str.isEmpty()) {
                return recursiveCheckNum(String.valueOf(str.charAt(0))) && recursiveCheckNum(str.substring(1));
        }
        return false;
    }
    private static boolean checkInt(String str)
    {
        boolean flag = false;
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (char s:str.toCharArray())
        {
            for (char n:num)
            {
                if(s == n) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
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

    public static void main(String[] args) {

        Double varD = Double.valueOf("0.1");
        System.out.println(recursiveCheckNum("12345"));
    }


}
