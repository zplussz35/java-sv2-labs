package algorithmstransformation.primalschool;

import algorithmstransformation.person.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolTest {
    PrimarySchool primarySchool;
    @BeforeEach
    void init(){
        primarySchool = new PrimarySchool(Arrays.asList(new Person("Zoltán",12,"utca"),
                new Person("Tamás",44,"utca"),
                new Person("Bálint",13,"utca"),
                new Person("Kitti",7,"utca"),
                new Person("Csongor",55,"utca"),
                new Person("Borbála",35,"utca"),
                new Person("Kincső",6,"utca"),
                new Person("János",10,"utca")
                ));
    }

    @Test
    void getStudents() {
        assertEquals(5,primarySchool.getStudents().size());
    }
}