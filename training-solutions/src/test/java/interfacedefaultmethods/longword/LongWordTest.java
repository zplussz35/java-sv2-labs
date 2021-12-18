package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void testGetLongWord() {
        LongWord lw = new LongWord();
        assertEquals("LONGWORD",lw.getLongWord());
    }
}