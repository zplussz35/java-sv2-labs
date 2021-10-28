package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee= new Employee("Zoltán",2021,500_000);
        System.out.println(employee);

        employee.raiseSalary(100_000);
        System.out.println();
        System.out.println("After raise salary: ");
        System.out.println(employee);
    }
}
