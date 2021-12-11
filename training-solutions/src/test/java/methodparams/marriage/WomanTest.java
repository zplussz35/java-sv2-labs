package methodparams.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {
    @Test
    void init(){
        List<RegisterDate> lRegisters = Arrays.asList(new RegisterDate("születési ideje", LocalDate.of(1999,11,16)),
                new RegisterDate("házasságkötés ideje", LocalDate.of(2020,12,16)));
        Woman woman = new Woman("Tóth Krisztina",lRegisters);
        assertEquals("Tóth Krisztina",woman.getName());
        assertEquals(LocalDate.of(2020,12,16),woman.getRegisterDates().get(1).getDate());
    }

}