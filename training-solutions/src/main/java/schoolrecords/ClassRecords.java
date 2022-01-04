package schoolrecords;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();


    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public boolean addStudent(Student student) {

        for (Student s : students) {
            if (s.getName().equals(student.getName())) {
                return false;
            }
        }
        this.students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        try{
            for (Student s : students) {
                if (s.getName().equals(student.getName())) {
                    this.students.remove(student);
                    return true;
                }
            }
            return false;
        }
        catch (IllegalArgumentException ia){
            throw new IllegalStateException("There is no student with that name!");
        }

    }

    public double calculateClassAverage() {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double result = 0.0;
        for (Student student : students) {
            result += student.calculateAverage();
        }
        if (result == 0.0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return result / students.size();
    }

    public double calculateClassAverageBySubject(Subject subject) {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double result = 0.0;
        int count=0;
        for (Student student : students) {
            if(student.calculateSubjectAverage(subject)!=0.0){
                result += student.calculateSubjectAverage(subject);
                count++;
            }
        }
        if (result == 0.0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        result=result/count;
        return BigDecimal.valueOf(result).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public Student findStudentByName(String name) {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);

    }

    public Student repetition() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(random.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> result = new ArrayList<>();
        for (Student student : students) {
            result.add(new StudyResultByName(student.getName(), student.calculateAverage()));
        }
        return result;
    }

    public String listStudentNames() {
        if (students.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.getName()).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());

        return sb.toString();
    }

    public String getClassName() {
        return className;
    }

    private boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }
}
