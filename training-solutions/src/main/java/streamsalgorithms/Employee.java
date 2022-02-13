package streamsalgorithms;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>(Arrays.asList(new Employee("Zoltán",1999),
                new Employee("László",1997),
                new Employee("Krisztina",1988),
                new Employee("Zoé",1955),
                new Employee("Márk",1977),
                new Employee("Sanyi",1958)));

        int sumOfYears=employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .sum();
        int sumOfAges=employees.stream()
                .mapToInt(e-> LocalDate.now().getYear()-e.getYearOfBirth())
                .sum();
        long numberOfEmployees= employees.stream().count();
        long numberOFEmployeesWithPredicate=employees.stream()
                .filter(e->e.getYearOfBirth()<1990)
                .count();
        OptionalInt earliestBirthEmployee=employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .min();
        Optional<String> EarliestBirthEmployeeName=employees.stream()
                .sorted(Comparator.comparing(Employee::getYearOfBirth))
                .map(Employee::getName)
                .findFirst();

        boolean isEveryEmployeeBirthBefore=employees.stream()
                .allMatch(e->e.getYearOfBirth()<1980);
        List<Employee> employeesBirthBefore=employees.stream()
                .filter(e->e.getYearOfBirth()<1990)
                .collect(Collectors.toList());
        List<String> employeesNames=employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        List<String> employeesNamesWithPredicate=employees.stream()
                .filter(e->e.getYearOfBirth()<1990)
                .map(Employee::getName)
                .collect(Collectors.toList());

    }
}
