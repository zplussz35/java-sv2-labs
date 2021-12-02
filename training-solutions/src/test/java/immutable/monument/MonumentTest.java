package immutable.monument;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonumentTest {

    @Test
    void testCreate(){
        Monument m = new Monument("Szobor","A szobor","2021-10-10","123");
        assertEquals("Szobor",m.getName());
        assertEquals("A szobor",m.getTitle());
        assertEquals("2021-10-10",m.getDateOfSerialized());
        assertEquals("123",m.getSerialNumber());
    }

    @Test
    void testIsEmpty()throws IllegalArgumentException{

        assertThrows(IllegalArgumentException.class,()->new Monument(null,"A szobor","2021-10-10","123"));
    }

}