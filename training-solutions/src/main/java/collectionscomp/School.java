package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentsComparator());

        students.add(new Student("Zoltán",170));
        students.add(new Student("Gimli",179));
        students.add(new Student("Legolas",160));
        students.add(new Student("Sándor",150));
        students.add(new Student("Mária",180));
        students.add(new Student("Csaba",130));
        System.out.println(students);

        Map<String, Integer> studentMap = new TreeMap<>(Collator.getInstance(new Locale("hu","HU")));
        for (Student s:students) {
            studentMap.put(s.getName(),s.getHeight());
        }
        System.out.println(studentMap);
    }
}
