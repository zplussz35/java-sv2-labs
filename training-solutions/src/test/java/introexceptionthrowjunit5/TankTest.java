package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {
    Tank t = new Tank();

    @Test
    void testModifyAnlge(){
        t.modifyAngle(10);
        assertEquals(10,t.getAngle());
    }

    @Test
    void testModifyAngleWithWrongAngle(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,()->t.modifyAngle(100));
        assertEquals("Bigger than 80 angle!",ex.getMessage());
    }

}