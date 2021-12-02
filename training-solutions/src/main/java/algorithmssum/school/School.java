package algorithmssum.school;

import java.util.ArrayList;
import java.util.List;

public class School {

    public int getNumberOfStudents(List<Integer> headcounts){
        int result=0;
        for (int n:headcounts) {
            result+=n;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> studentsInClasses= new ArrayList<>();
        studentsInClasses.add(35);
        studentsInClasses.add(20);
        studentsInClasses.add(29);
        studentsInClasses.add(32);
        studentsInClasses.add(31);
        studentsInClasses.add(23);

        School school = new School();
        System.out.println("number of Students: "+school.getNumberOfStudents(studentsInClasses));
    }
}
