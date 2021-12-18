package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {
    @Test
    void testCreate(){
        TableCloth tc = new TableCloth(10.0);
        assertEquals(100.0,tc.getArea(),0.000001);
        assertEquals(40.0,tc.getPerimeter());
        assertEquals(14.1421356,tc.getLengthOfDiagonal(),0.0000001);
        assertEquals(10.0,tc.getSide());
        assertEquals(4,tc.getNumberOfSides());

    }

}