package schoolrecords;

import java.util.*;

public class SchoolRecordsController {
    private static ClassRecords classRecords;
    private static List<Subject> subjects = new ArrayList<>();
    private static List<Tutor> tutors = new ArrayList<>();


    public static void main(String[] args) {
        classRecords = new ClassRecords("Fourth Grade A", new Random(5));
        initSchool();

        Scanner sc = new Scanner(System.in);
        int input = 0;
        boolean run = true;
        while (run) {
            System.out.println("\n\n\n1. Diákok nevének listázása\n" +
                    "2. Diák név alapján keresése\n" +
                    "3. Diák létrehozása\n" +
                    "4. Diák név alapján törlése\n" +
                    "5. Diák feleltetése\n" +
                    "6. Osztályátlag kiszámolása\n" +
                    "7. Tantárgyi átlag kiszámolása\n" +
                    "8. Diákok átlagának megjelenítése\n" +
                    "9. Diák átlagának kiírása\n" +
                    "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                    "11. Kilépés\n\n\n");

            System.out.print("Adja meg a műveletet: ");
            input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    listStudentNames();
                    break;
                case 2:
                    findStudentByName();
                    break;
                case 3:
                    addStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    repetition();
                    break;
                case 6:
                    calculateClassAverage();
                    break;
                case 7:
                    calculateClassAverageBySubject();
                    break;
                case 8:
                    listStudyResults();
                    break;
                case 9:
                    calculateAverageByName();
                    break;
                case 10:
                    calculateAverageByNameAndSubject();
                    break;
                case 11:
                    run = false;
                    break;
                default:
                    System.out.println("Hibás művelet, próbálja újra!\n\n");
            }
        }
    }

    private static void initSchool() {
        subjects.add(new Subject("történelem"));
        subjects.add(new Subject("magyar"));
        subjects.add(new Subject("matematika"));
        subjects.add(new Subject("fizika"));
        subjects.add(new Subject("angol"));

        tutors.add(new Tutor("Tünde", Arrays.asList(new Subject("történelem"), new Subject("magyar"))));
        tutors.add(new Tutor("Bálint", Arrays.asList(new Subject("matematika"), new Subject("fizika"))));
        tutors.add(new Tutor("Ágnes", List.of(new Subject("angol"))));
    }

    public static void listStudentNames() {
        System.out.println(classRecords.listStudentNames());
    }

    public static void findStudentByName() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Adja meg a diák nevét: ");
            String name = sc.nextLine();
            System.out.println(classRecords.findStudentByName(name));
        } catch (IllegalStateException | IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg az új diák nevét: ");
        String newStudentName = sc.nextLine();
        if (classRecords.addStudent(new Student(newStudentName))) {
            System.out.println(newStudentName + " hozzáadva az osztályhoz!");
        }else{
            System.out.println(newStudentName + " -> Már van az osztályban!");
        }


    }

    public static void removeStudent() {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Adja meg a törlendő diák nevét: ");
            String deleteStudentName = sc.nextLine();
            if (classRecords.removeStudent(classRecords.findStudentByName(deleteStudentName))) {
                System.out.println(deleteStudentName + " törölve!");
            }
            else{
                System.out.println(deleteStudentName + " -> Nincs az osztályban!");
            }
        }catch (IllegalStateException |IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void repetition() {
        try {
            Scanner sc = new Scanner(System.in);
            Student student = classRecords.repetition();
            System.out.println(student);
            System.out.println("Adja meg az érdemjegyet (szövegesen:A(5=excellent 4=very good 3=improvement needed 2=close fail 1=fail");
            String markName = sc.nextLine();
            System.out.println("Adja meg a tárgy nevét: ");
            String subjectName = sc.nextLine();
            System.out.println("Adja meg a nevét: ");
            String tutorName = sc.nextLine();
            int subjectIndex = -1;
            int tutorIndex = -1;
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).getName().equals(subjectName)) {
                    subjectIndex = i;
                }
            }
            for (int i = 0; i < tutors.size(); i++) {
                if (tutors.get(i).getName().equals(tutorName)) {
                    tutorIndex = i;
                }
            }
            Mark mark = new Mark(markName, subjects.get(subjectIndex), tutors.get(tutorIndex));
            student.grading(mark);
            System.out.println("Jegy beírva!\n\n");
        } catch (IllegalStateException | IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void calculateClassAverage() {
        try {
            System.out.println("Az osztály átlaga: " + classRecords.calculateClassAverage() + "\n\n");
        } catch (ArithmeticException ai) {
            System.out.println(ai.getMessage());
        }

    }

    public static void calculateClassAverageBySubject() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Adja meg a tantárgyat: ");
            String subjectName = sc.nextLine();
            int subIndex = -1;
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).getName().equals(subjectName)) {
                    subIndex = i;
                }
            }
            System.out.println("Az osztály átlaga " + subjectName + " tantárgyból: "
                    + classRecords.calculateClassAverageBySubject(subjects.get(subIndex)) + "\n\n");
        } catch (ArithmeticException | IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void listStudyResults() {
        System.out.println("A diákok átlagai:");
        System.out.println(classRecords.listStudyResults());
        System.out.println("\n\n");
    }

    public static void calculateAverageByName() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Adja meg a diák nevét: ");
            String name = sc.nextLine();
            Student student = classRecords.findStudentByName(name);
            System.out.println("A tanuló eredménye: " + student.calculateAverage() + "\n\n");

        } catch (IllegalStateException | IllegalArgumentException | ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void calculateAverageByNameAndSubject() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Adja meg a diák nevét: ");
            String name = sc.nextLine();
            System.out.print("adja meg a tantárgyat: ");
            String subjectName = sc.nextLine();
            int subIndex = -1;
            Student student = classRecords.findStudentByName(name);
            for (int i = 0; i < subjects.size(); i++) {
                if (subjects.get(i).getName().equals(subjectName)) {
                    subIndex = i;
                }
            }
            System.out.println(name + " eredménye " + subjectName + " tantárgyból: "
                    + student.calculateSubjectAverage(subjects.get(subIndex)));
            System.out.println("\n\n");

        } catch (IllegalStateException | IllegalArgumentException | ArithmeticException | IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }


    }

}
