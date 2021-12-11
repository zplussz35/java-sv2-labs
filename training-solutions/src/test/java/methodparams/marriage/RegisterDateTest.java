package methodparams.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegisterDateTest {
    @Test
    void init(){
        RegisterDate d = new RegisterDate("születési ideje", LocalDate.of(1999,11,16));
        assertEquals("születési ideje",d.getDescription());
        assertEquals(LocalDate.of(1999,11,16),d.getDate());
    }

}