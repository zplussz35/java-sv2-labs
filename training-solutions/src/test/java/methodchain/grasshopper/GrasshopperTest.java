package methodchain.grasshopper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    @Test
    void moveFromZeroToThreeWithFiveHops() {
        Grasshopper gr = new Grasshopper();
        gr.moveFromZeroToThreeWithFiveHops();
        assertEquals(3,gr.getPosition());
    }
}