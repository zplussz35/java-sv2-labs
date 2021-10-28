package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registration registration= new Registration();

        System.out.print("Adja meg a vezetéknevét: ");
        String firstname=sc.nextLine();
        System.out.print("Adja meg a keresztnevét: ");
        String lastname=sc.nextLine();
        String fullName=registration.concatenateName(firstname,lastname);

        System.out.print("Adja meg a születési évét: ");
        int yearOfBirth=sc.nextInt();
        sc.nextLine();
        System.out.print("Adja meg a születési hónapjának sorszámát: ");
        int monthOfBirth=sc.nextInt();
        sc.nextLine();
        System.out.print("Adja meg a születési napját: ");
        int dayOfBirth=sc.nextInt();
        sc.nextLine();
        LocalDate DateOfBirth= registration.concateDate(yearOfBirth,monthOfBirth,dayOfBirth);

        System.out.print("e-mail cím: ");
        String email=sc.nextLine();

        Person person= new Person(fullName,DateOfBirth,email);

        System.out.println("Az Ön által megadott adatai:");
        System.out.println(person);


    }

    public String concatenateName(String firstname,String lastname){
        return firstname+" "+lastname;
    }
    public LocalDate concateDate(int year,int month, int day){
        return LocalDate.of(year,month,day);
    }
}
