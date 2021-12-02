package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void testContainsFewerHabitants() {
        List<Integer> pops= Arrays.asList(10,20,30,40,50,1,2,70,10);

        assertTrue(new Town().containsFewerHabitants(pops,10));
        assertFalse(new Town().containsFewerHabitants(pops,0));
    }
}