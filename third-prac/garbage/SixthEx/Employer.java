package SixthEx;
//Создайте пример наследования, реализуйте класс Employer и
//        класс Manager. Manager отличается от Employer наличием дополнительных
//        выплат от продаж а) Класс Employer содержит переменные: StringfirstName, lastName и поле income для заработной платы. Класс Manager
//        также имеет поле double averageSum содержащую среднюю суммы
//        дополнительных выплат за продажи. б) Создать переменную типа Employer,
//        которая ссылается на объект типа Manager. в) Создать метод getIncome() для
//        класса Employer, который возвращает заработную плату. Если средняя
//        количество отработанных дней, то сумма дохода умножается на 12.
//        Переопределить этот метод в классе Manager и добавить к доходу сумму с
//        продаж. г) Создать массив типа Employer содержащий объекты класса
//        Employer и Manager. Вызвать метод getIncome() для каждого элемента
//        массива.
public class Employer {
    String firstName, lastname;
    Float income;

    public Employer(Float income) {
        this.income = income;
    }

    public Float getIncome() {
        return income;
    }
}
