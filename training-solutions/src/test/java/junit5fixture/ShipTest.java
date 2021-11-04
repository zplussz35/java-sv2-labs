package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    Ship ship;

    @BeforeEach
    void initShip(){
        ship= new Ship("Titanic",1970,200.35);
    }

    @Test
    void testName(){
        assertEquals("Titanic",ship.getName());
        assertNotEquals("Titania",ship.getName());
    }

    @Test
    void testYearOfConstruction(){
        assertEquals(1970,ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction()==1970);
        assertFalse(ship.getYearOfConstruction()==1971);
    }

    @Test
    void testLength(){
        assertEquals(200.35,ship.getLength(),0.005);
    }
    @Test
    void testNull(){
        Ship ship2=null;
        assertNull(ship2);
        assertNotNull(ship);
    }
    @Test
    void testSameObjects(){
        Ship ship3=ship;
        assertSame(ship,ship3);
    }

    @Test
    void testNotSameObjects(){
        Ship ship4= new Ship("Titanic",1970,200.35);
        assertNotSame(ship,ship4);

    }
}
