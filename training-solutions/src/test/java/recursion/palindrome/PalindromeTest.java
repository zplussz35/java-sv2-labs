package recursion.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testIsPalindrome() {
        assertTrue(new Palindrome().isPalindrome("indulagorogaludni"));
        assertFalse(new Palindrome().isPalindrome("alma"));
        assertTrue(new Palindrome().isPalindrome(""));
        assertTrue(new Palindrome().isPalindrome("c"));
    }
}