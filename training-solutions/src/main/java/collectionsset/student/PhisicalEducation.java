package collectionsset.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhisicalEducation {
    private Set<Integer> getOrderInLessons(List<Student> students){
        Set<Integer> orderedStudents =new TreeSet<>();
        for (Student s:students) {
            orderedStudents.add(s.getHeight());
        }
        return orderedStudents;
    }

    public static void main(String[] args) {
        PhisicalEducation phisicalEducation=new PhisicalEducation();
        List<Student> students= new ArrayList<>();
        students.add(new Student("Zoltán",160));
        students.add(new Student("Zsombor",170));
        students.add(new Student("Ádám",100));
        students.add(new Student("Kitti",130));
        students.add(new Student("Dani",140));
        students.add(new Student("Csongor",146));
        students.add(new Student("Eszter",176));
        students.add(new Student("Máté",105));
        students.add(new Student("Bálint",210));
        System.out.println(phisicalEducation.getOrderInLessons(students));
    }
}
