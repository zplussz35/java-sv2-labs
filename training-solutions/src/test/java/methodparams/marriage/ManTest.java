package methodparams.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {
    @Test
    void init(){
        List<RegisterDate> lRegisters = Arrays.asList(new RegisterDate("születési ideje", LocalDate.of(1999,11,16)),
                new RegisterDate("házasságkötés ideje", LocalDate.of(2020,12,16)));
        Man man = new Man("Tóth Zoltán",lRegisters);
        assertEquals("Tóth Zoltán",man.getName());
        assertEquals(LocalDate.of(2020,12,16),man.getRegisterDates().get(1).getDate());
    }

}