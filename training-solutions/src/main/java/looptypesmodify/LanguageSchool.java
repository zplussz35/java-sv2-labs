package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1= new Student("Zoltán");
        Student student2= new Student("Barbara");
        Student student3= new Student("Tibor");
        Student student4= new Student("Eszter");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        //set some members acive:false
        for (int i = 0; i < students.size(); i+=2) {
            students.get(i).setActive(false);
        }
        //before delete:
        System.out.println("Before delete: ");
        for (Student s:students) {
            System.out.print(s.getName()+" ");
        }
        System.out.println("--> memebers: "+students.size());
        //delete active:false members
        List<Student> studentsToRemove= new ArrayList<>();
        for (Student s:students) {
            if (!s.isActive()){
                studentsToRemove.add(s);
            }
        }
        students.removeAll(studentsToRemove);

        //after delete:
        System.out.println("After delete: ");
        for (Student s:students) {
            System.out.print(s.getName()+" ");
        }
        System.out.println("--> members: "+students.size());

    }
}
