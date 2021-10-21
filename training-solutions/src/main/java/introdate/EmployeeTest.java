package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give new employee's:\r\n*name: ");
        String name=sc.nextLine();
        System.out.print("*Year of birth: ");
        int year=sc.nextInt();
        sc.nextLine();
        System.out.print("*Month of birth: ");
        int month=sc.nextInt();
        sc.nextLine();
        System.out.print("*Day of birth: ");
        int day=sc.nextInt();
        sc.nextLine();

        Employee employee = new Employee(year,month,day,name);

        employee.setName("Dr. "+name);

        System.out.println("Name: "+employee.getName());
        System.out.println("Date of Birth: "+employee.getDateOfBirth());
        System.out.println("Beginning employment: "+employee.getBeginEmployment());
    }
}
