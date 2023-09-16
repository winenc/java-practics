package SixthEx;
/*3. Разработать класс Отчет о сотрудниках
        1) Создать класс Employee, у которого есть переменные класса -
        fullname, salary.
        2) Создать массив, содержащий несколько объектов этого типа.
        3) Создать класс Report со статическим методом generateReport,
        в котором выводится информация о зарплате всех сотрудников.
        4) Используйте форматирование строк. Пусть salary будет
        выровнено по правому краю, десятичное значение имеет 2 знака после
        запятой и можете добавить что-нибудь свое. */

import SixthEx.Employee.Employee;
import SixthEx.Report.Report;

public class SixthEx {
    public static void main(String[] args) {
        Employee[] person = {
                new Employee("Djamshut",100F),
                new Employee("Murat",5000F),
                new Employee("Ruslan",5000F),
                new Employee("Alchibek",2000F),
                new Employee("Hui",1000F),
                new Employee("Maria",1000F),
                new Employee("Elnara",1000F),
                new Employee("Renat",2000F),
                new Employee("Comutirad",1000F),
                new Employee("Akakii",2000F),
                new Employee("Sidr",2000F),
        };
        Report.generaiteReport(person);
    }
}
