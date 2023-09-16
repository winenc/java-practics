package Convertor;
import static Convertor.Currency.*;
import static Convertor.Currency.typeOfCurr.*;

/*Задание на форматирование строк вывода
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

public class Convertor {
     typeOfCurr tc = EURO;
     Float oneOfDerham;
     int sizeline = 3;
    Currency[] adjacencyLine = {new Currency(BAKS, 1.07F),new Currency(TENGE,499.64F),new Currency(RUBLE,103.32F)};

    //denga - сумма денег, которые хотите конвертировать. type - валюта этих денег.
    public Convertor(typeOfCurr type, Float denga)
    {
        convert(type,denga);
    }

    //type - в какую валюту вы хотите конвертировать.
    public float getDenga(typeOfCurr type)
    {
        for (int i = 0; i<sizeline;i++)
        {
            if(adjacencyLine[i].getCurr() == type)
            {
                return adjacencyLine[i].getQuan()*oneOfDerham;
            }
        }
        return 0F;
    }


    //то же самое, что конструктор;
    public void convert(typeOfCurr type, Float denga)
    {
        this.oneOfDerham = denga;

        int mainC = 0;
        for(int i = 0; i < sizeline; i++) {
            if(adjacencyLine[i].getCurr() == type) {
                adjacencyLine[i].setQuan(1/adjacencyLine[i].getQuan());
                mainC = i;
            }

        }
        for(int i = 0; i < sizeline; i++)
        {
            if(adjacencyLine[i].getCurr() != type)
            {
                adjacencyLine[i].setQuan(1/(1/adjacencyLine[mainC].getQuan()/adjacencyLine[i].getQuan()));
            }
        }

        adjacencyLine[mainC].setCurr(this.tc);
        this.tc = type;


//        System.out.println(tc);
//        for(int i = 0; i < sizeline; i++)
//        {
//            System.out.println(adjacencyLine[i].toString() + "    ") ;
//        }
    }

    public static void main(String[] args) {

    }

}
