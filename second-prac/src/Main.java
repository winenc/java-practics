/*Задания на практическую работу № 2
        1. По диаграмме класса UML описывающей сущность Автор.
        Необходимо написать программу, которая состоит из двух классов Author и
        TestAuthor. Класс Author должен содержать реализацию методов,
        представленных на диаграмме класса на рисунке 2.4.
        Author
        -name:String
        -email:String
        -gender:char
        ---------
        Author(name:String,email:String,gender:char)
        +get name():String
        +get-email():String
        +set-email(email:String):void
        +get gender():char
        +to-string():String
        3. Создать класс точка Point, описывающий точку на плоскости. Создать
Circle класс, в котором одно поле представляет точку – центр окружности, и
добавить другие свойства, позволяющие задать точку на плоскости. Создать
третий класс Tester который использует для хранения объектов массив
объектов Circle и второе поле количество элементов в массиве.
        4. Разработайте класс Shop для, реализуйте методы добавления и
удаления компьютеров в магазине, добавьте метод поиска в магазине
компьютера, нужного пользователю. Протестируйте работу созданных классов.
Данные для заполнения массива компьютеров вводятся с клавиатуры
пользователем. Для этого реализуйте интерфейс.
        5. Разработайте и реализуйте класс Dog (Собака), поля класса
описывают кличку и возраст собаки. Необходимо выполнить следующие
действия: определить конструктор собаки, чтобы принять и инициализировать
данные экземпляра., включить стандартные методы (аксессоры) для получения
и установки для имени и возраста, включить метод для перевода возраста
собаки в “человеческий” возраст (возраст семь раз собаки), включите метод
ToString, который возвращает описание экземпляра собаки в виде строки.
Создание класса тестера под названием ПитомникСобак, реализует массив
собак и основной метод этого класса позволяет добавить в него несколько
объектов собаки.
        6. Создать класс, описывающий модель окружности (Circle). В классе
должны быть описаны нужные свойства окружности и методы для получения и
22
изменения этих свойств. Добавить методы для расчета площади круга и длины
окружности, а также метод позволяющий сравнивать две окружности. При
помощи класса CircleTest, содержащего статический метод main(String[] args),
протестировать работу класcа Circle.
        7. Создать класс, описывающий книгу (Book). В классе должны быть
описаны нужные свойства книги (автор, название, год написания и т. д.) и
методы для получения, изменения этих свойств. Протестировать работу класса
в классе BookTest, содержащим метод статический main(String[] args). Создать
класс книжная полка, в котором поля данных класса это массив объектов типа
книги (Book, и количество книг на книжной полке. Написать методы класса,
которые возвращают книги с самым поздним и самым ранним сроком издания.
Написать метод класса, позволяющий расставить книги на книжной полке в
порядке возрастания года выпуска. Используйте реализацию отношений
композиция классов.
        8. Напишите программу, которая меняет местами элементы
одномерного массива из String в обратном порядке. Не используйте
дополнительный массив для хранения результатов.
        9. Напишите программу Poker.java, которая должна имитировать
раздачу карт для игры в покер. Программа получает число n, задаваемое с
консоли пользователем, и раздает карты на n игроков (по 5 карт каждому) из
перетасованной колоды. Разделяйте пять карт, выданных каждому игроку,
пустой строкой.
        10. Напишите программу HowMany.java, которая определит, сколько
слов Вы ввели с консоли */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}