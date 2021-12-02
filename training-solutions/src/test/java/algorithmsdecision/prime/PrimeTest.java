package algorithmsdecision.prime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void testIsPrime() {
        assertTrue(new Prime().isPrime(101));
        assertTrue(new Prime().isPrime(7));
        assertTrue(new Prime().isPrime(53));
        assertFalse(new Prime().isPrime(1));
    }
}