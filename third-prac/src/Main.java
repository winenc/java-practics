/*Задания на практическую работу № 3

        1,3,4 зададния на классы и оболочки:
        1 задание полностью без таблицы, задания на форматирование строк.
        Задания на Math и Random
        1. Создать массив вещественных чисел случайным образом, вывести его
        на экран, отсортировать его, и снова вывести на экран (использовать два
        подхода к генерации случайных чисел – метод random() класса Math и класс
        Random)
        2. Создать класс точка Point, описывающий точку на плоскости.
        Создать Circle класс, в котором одно поле представляет точку – центр
        окружности, и добавить другие свойства, позволяющие задать точку на
        плоскости. Создать третий класс Tester который использует для хранения
        объектов массив объектов Circle и второе поле количество элементов в массиве.
        Добавить в класс методы, позволяющие найти самую маленькую и самую
        большую окружность. Добавить в класс метод, упорядочивающий хранение
        окружностей в массив. Для инициализации полей радиуса и длины окружности
        используйте класс Random или метод random() класса Math по желанию
        3. Создайте массив из 4 случайных целых чисел из отрезка [10;99],
        выведите его на экран в строку, далее определите и выведите на экран
        сообщение о том, является ли массив строго возрастающей последовательностью.
        4. Пользователь должен ввести с клавиатуры размер массива -
        натуральное число больше, так чтобы введенное пользователем число
        сохранялось в переменную n. Если пользователь ввел не подходящее число, то
        программа должна просить пользователя повторить ввод. Создать массив из n
        случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй
        массив только из четных элементов первого массива, если они там есть, и
        вывести его на экран.
        5. Пользователь должен ввести с клавиатуры размер массива -
        натуральное число больше, так чтобы введенное пользователем число
        сохранялось в переменную n. Если пользователь ввел не подходящее число, то
        программа должна просить пользователя повторить ввод. Создать массив из n
        случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй
        массив только из четных элементов первого массива, если они там есть, и
        вывести его на экран.
        34
        последовательностью.
        4. Пользователь должен ввести с клавиатуры размер массива -
        натуральное число больше, так чтобы введенное пользователем число
        сохранялось в переменную n. Если пользователь ввел не подходящее число, то
        программа должна просить пользователя повторить ввод. Создать массив из n
        случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй
        массив только из четных элементов первого массива, если они там есть, и
        вывести его на экран.
        5. Пользователь должен ввести с клавиатуры размер массива -
        натуральное число больше, так чтобы введенное пользователем число
        сохранялось в переменную n. Если пользователь ввел не подходящее число, то
        программа должна просить пользователя повторить ввод. Создать массив из n
        случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй
        массив только из четных элементов первого массива, если они там есть, и
        вывести его на экран


        Задания на классы Оболочки
        Задание 1
        1. Создайте объекты класса Double, используя методы valueOf().
        2. Преобразовать значение типа String к типу double. Используем
        метод Double.parseDouble().
        3. Преобразовать объект класса Double ко всем примитивным типам.
        4. Вывести значение объекта Double на консоль.
        5. Преобразовать литерал типа double к строке: String d =
        Double.toString(3.14);

        Задание 2
        Заполнить таблицу табл. 3.2 Методы классов оболочек - на пересечении
        указать x, если данный метод существует у соответствующего класса оболочки.

                    Таблица 3.2 Методы классов оболочек
                    Boolean Byte Character Double Float Integer Long Short isStatic
        byteValue
        doubleValue
        floatValue
        intValue
        longValue
        shortValue
        parseXxx
        parseXxx with radix
        valueOf with radix
        toString
        toString(primitive)
        toString(primitive,radix)


        Задание на форматирование строк вывода
        1. Создать класс конвертор валют.
        2. Создать мини-Приложение интернет-магазин. В приложении
        рассчитывается стоимость покупки товара, где пользователь может выбрать
        валюту для оплаты товара
        3. Разработать класс Отчет о сотрудниках
        1) Создать класс Employee, у которого есть переменные класса -
        fullname, salary.
        2) Создать массив, содержащий несколько объектов этого типа.
        3) Создать класс Report со статическим методом generateReport,
        в котором выводится информация о зарплате всех сотрудников.
        4) Используйте форматирование строк. Пусть salary будет
        выровнено по правому краю, десятичное значение имеет 2 знака после
        запятой и можете добавить что-нибудь свое.  */


import FirstEx.FirstEx;
import SecondEx.SecondEx;
import ThirdEx.ThirdEx;
import MiniApp.MiniApp;

import java.util.Scanner;

public class Main {
    public static void fourthEx() {
        Scanner in = new Scanner(System.in);
        Double varD = Double.valueOf(  Double.parseDouble("0.1234")  );
        float f = varD.floatValue();
        int n = varD.intValue();
        long l = varD.longValue();
        String str = String.valueOf(varD.toString());
        System.out.println(varD);

        System.out.println(Double.toString(0.987));

    }
    public static void fifthOneEx()
    {
        MiniApp market = new MiniApp();
        market.start();
    }

    public static void main(String[] args) {
//        FirstEx ex1 = new FirstEx(5);
//        ex1.start();
//        SecondEx ex2 = new SecondEx();
//        ex2.start();//1/13 1/8 1/18 1/18 1/11 1/30 1/3 (~~7%)
//        ThirdEx ex3 = new ThirdEx();
//        ex3.start();

//        fourthEx();
//
        fifthOneEx();


    }
}//hui
