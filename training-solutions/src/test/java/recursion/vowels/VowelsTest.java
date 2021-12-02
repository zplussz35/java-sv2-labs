package recursion.vowels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void testGetNumberOfVowels() {
        assertEquals(2,new Vowels().getNumberOfVowels("alma"));
        assertEquals(0,new Vowels().getNumberOfVowels("xyz"));
        assertEquals(0,new Vowels().getNumberOfVowels(""));
        assertEquals(5,new Vowels().getNumberOfVowels("aranyalmafa"));
    }
}