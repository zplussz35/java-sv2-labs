package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Person> persons = new ArrayList<>();

    public void  addPerson(Person person){
        this.persons.add(person);
    }

    public List<Person> getPersons(){
        return this.persons;
    }
}
