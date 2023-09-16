package SixthEx.Employee;

public class Employee {
    Float salary;
    String fullname;

    public Employee(String fullname,Float salary)
    {
        this.fullname = fullname;
        this.salary = salary;
    }
    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
