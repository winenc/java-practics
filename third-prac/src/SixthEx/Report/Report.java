package SixthEx.Report;

import SixthEx.Employee.Employee;

public class Report {
    public static void generaiteReport(Employee[] person) {

        System.out.printf("%-35s%-9s%-10s","Сотрудник","   |   ","Зарплата");
        System.out.println();

        int num=1;
        for (Employee e:person) {
            System.out.printf("%-35s%-9s", num+". "+e.getFullname(),"   :   ");
            System.out.printf("%8s",String.format("%.0f", e.getSalary()));
            System.out.println();
            num++;
        }



    }


}
