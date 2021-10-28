package intromethods.employee;

import java.time.LocalDate;

public class Employee {
    private String name;
    private int hiringYear;
    private int salary;

    public Employee(String name, int hiringYear, int salary) {
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getHiringYear() {
        return hiringYear;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raiseSalary(int raise){
        this.salary+=raise;
    }

    @Override
    public String toString() {
        return "Employee name : "+this.name+
                "\nEmployee year of hiring: "+this.hiringYear+
                "\nEmployee salary: "+this.salary;
    }
}
