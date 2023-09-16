package SecondEx;
/*Соз      класс Phone, который содержит переменные number,
    model и weight.
1)Создайте три экземпляра этого класса. 2) Выведите на консоль значения
    их переменных. 3) Добавить в класс Phone методы: receiveCall, имеет один
    параметр – имя звонящего. 4)Выводит на консоль сообщение “Звонит {name}”.
            5)Метод getNumber – возвращает номер телефона. 6) Вызвать эти методы для
    каждого из объектов. 7) Добавить конструктор в класс Phone, который
    принимает на вход три параметра для инициализации переменных класса -
    number, model и weight. 8)Добавить конструктор, который принимает на вход
    два параметра для инициализации переменных класса - number, model.
9)Добавить конструктор без параметров. 10)Вызвать из конструктора с тремя
    параметрами конструктор с двумя. 11)Добавьте перегруженный метод.
            receiveCall, который принимает два параметра - имя звонящего и номер
    телефона звонящего. 12)Вызвать этот метод. 13)Создать метод sendMessage с
    аргументами переменной длины. Данный метод принимает на вход номера
    телефонов, которым будет отправлено сообщение. 14)Метод выводит на
    консоль номера этих телефонов.*/
public class Phone {
    String number;
    String model;
    Float weight;

    public void display()
    {
        System.out.println("number: "+number);
        System.out.println("model: "+model);
        System.out.println("weight: "+weight);
    }

    public void receiveCall(String name)
    {
        System.out.println("Звонит "+name);
    }
    public void receiveCall(String name, String number)
    {
        System.out.println("Звонит "+name+"" +
                "с номера "+number);
    }
    public void sendMessage(String[] number)
    {
        for (int i = 0; i<number.length;i++)
        {
            System.out.println("Номер "+i+1+": "+number[i]);
        }
    }
    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, Float weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public static void main(String[] args) {
        Phone[] p = new Phone[3];
        String[] names = {"Abdul","Palnarev","Jotaro"};

        String[] models = {"samsung","huawei","xiaomi"};
        String[] mainNumbers = {"234","567","890"};
        String[] numbers = {"123","456","789"};
        for (int i = 0; i < p.length; i++)
        {
            p[i] = new Phone(models[i],mainNumbers[i]);
        }
        for (int i = 0; i < p.length; i++)
        {
            p[i].receiveCall(names[i]);
            p[i].getNumber();
            p[i].receiveCall(names[i],numbers[i]);

        }



    }
}
