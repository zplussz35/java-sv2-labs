package introexceptionreadfiletestjunit4;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Paths;

import static org.junit.Assert.*;

public class WordsTest {

    @Test
    public void testGetFirstWordWithA() {
        String word = new Words().getFirstWordWithA(Paths.get("src/test/resources/words.txt"));
        assertEquals("alma",word);
    }

    public void testGetFirstWordWithAWithNoWord() {
        String word = new Words().getFirstWordWithA(Paths.get("src/test/resources/word2.txt"));
        assertEquals("A",word);
    }
}