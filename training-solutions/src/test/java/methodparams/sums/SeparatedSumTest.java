package methodparams.sums;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeparatedSumTest {

    @Test
    void testSum() {
        SeparatedSum separatedSum = new SeparatedSum();
        String floatingNumbers = separatedSum.readFromFile(Paths.get("src/test/resources/floatingnumbers.txt"));
        Sums sums = separatedSum.sum(floatingNumbers);

        assertEquals(110.6, sums.getSumPositives(), 0.0001);
        assertEquals(-153.3, sums.getSumNegatives(), 0.0001);
    }
}