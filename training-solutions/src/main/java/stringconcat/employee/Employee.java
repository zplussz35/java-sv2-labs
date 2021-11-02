package stringconcat.employee;

public class Employee {
    private String name;
    private String work;
    private int salary;

    public Employee(String name, String work, int salary) {
        this.name = name;
        this.work = work;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return name+" - "+work+" - "+salary+" Ft";
    }
}
