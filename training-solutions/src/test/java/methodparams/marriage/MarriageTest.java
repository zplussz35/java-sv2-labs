package methodparams.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    @Test
    void testGetMarried() {
        Marriage m = new Marriage();
        List<RegisterDate> womanDate= new ArrayList<>(Arrays.asList(new RegisterDate("születési ideje", LocalDate.of(2002,01,22))));
        List<RegisterDate> manDate= new ArrayList<>(Arrays.asList(new RegisterDate("születési ideje", LocalDate.of(1999,11,16))));

        Woman woman = new Woman("Szabó Krisztina",womanDate);
        Man man = new Man("Tóth Zoltán",manDate);
        m.getMarried(woman,man);
        assertEquals(LocalDate.now(),man.getRegisterDates().get(1).getDate());
        assertEquals(LocalDate.now(),woman.getRegisterDates().get(1).getDate());

        assertEquals("házasságkötés ideje",man.getRegisterDates().get(1).getDescription());
        assertEquals("házasságkötés ideje",woman.getRegisterDates().get(1).getDescription());
    }
}