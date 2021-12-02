package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void testGetMin() {

        List<Integer> temps = Arrays.asList(10,20,30,-2,-3,12,-4);
        assertEquals(-4,new Temperature().getMin(temps));
    }
}