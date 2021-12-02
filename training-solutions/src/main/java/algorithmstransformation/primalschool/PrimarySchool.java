package algorithmstransformation.primalschool;

import algorithmstransformation.person.Person;
import algorithmstransformation.student.Student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {
    List<Person> people;

    public PrimarySchool(List<Person> people) {
        this.people = people;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void addPerson(Person p){
        this.people.add(p);
    }
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        for (Person p:people) {
            if(p.getAge()<15){
                students.add(new Student(p.getName(),p.getAddress()));
            }
        }
        return students;
    }
}
