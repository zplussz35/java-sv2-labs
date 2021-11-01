package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent){
        if(student.getOmId().equals(anotherStudent.getOmId())&&
                student.getNeptunCode().equals(anotherStudent.getNeptunCode())){
            return true;
        }
        else
            return false;
    }
}
