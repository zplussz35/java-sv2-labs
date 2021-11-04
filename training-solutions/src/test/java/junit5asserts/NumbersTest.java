package junit5asserts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersTest {
    @Test
    void testGetEvenNumber(){
        assertArrayEquals(new int[]{2, 8, 0, 6, 2, 0, 0},
                new Numbers().getEvenNumbers(new int[]{2, 8, 5, 6, 2, 3, 9}));
    }
}
