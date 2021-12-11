package methodparams.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumsTest {
    @Test
    void init(){
        double positiveSum=135.5;
        double negativeSum=-70.5;
        Sums sums = new Sums(positiveSum,negativeSum);
        assertEquals(135.5,sums.getSumPositives());
        assertEquals(-70.5,sums.getSumNegatives());
    }

}