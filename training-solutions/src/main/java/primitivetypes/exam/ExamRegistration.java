package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exam exam = new Exam();
        String name;
        String year;
        String month;
        String day;
        String locateNum;
        String score;
        int i=1;

        System.out.println("Adja meg a vizsgára jelentkezők adatait(üres sor után ENTER--> kilépés)");
        do{
            System.out.println(i+".");
            System.out.print("Név: ");
            name=sc.nextLine();
            if(name.equals("")){
                System.out.println("Kilépés...");
                break;
            }

            System.out.print("Születési dátum:\nÉv: ");
            year=sc.nextLine();
            System.out.print("Hónap: ");
            month=sc.nextLine();
            System.out.print("Nap: ");
            day=sc.nextLine();
            if(year.equals("")||month.equals("")||day.equals("")){
                System.out.println("Kilépés...");
                break;
            }
            LocalDate dateOfBirth=LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),
                    Integer.parseInt(day));

            System.out.print("Irányítószám: ");
            locateNum=sc.nextLine();
            if(locateNum.equals("")){
                System.out.println("Kilépés...");
                break;
            }

            System.out.print("Átlag: ");
            score=sc.nextLine();
            if(score.equals("")){
                System.out.println("Kilépés...");
                System.out.println();
                break;
            }
            Person person = new Person(name,dateOfBirth,Integer.parseInt(locateNum),Double.parseDouble(score));
            exam.addPerson(person);
            i++;

        }while(true);

        System.out.println("Vizsgázók:");
        System.out.println(exam.getPersons());

    }
}
