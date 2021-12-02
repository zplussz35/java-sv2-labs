package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void testGetMax() {
        List<Integer> heights = Arrays.asList(100,200,300,400,10,20,1000);
        assertEquals(1000,new Hill().getMax(heights));
    }

}