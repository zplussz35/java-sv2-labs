package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @Test
    void getFirstWordWithA() {
        Words w = new Words();
        String word=w.getFirstWordWithA(Paths.get("src/test/resources/words.txt"));
        assertEquals("alma",word);
    }

    @Test
    void getFirstWordWithAWithWrong() {
        Words w = new Words();
        String word=w.getFirstWordWithA(Paths.get("src/test/resources/word2.txt"));
        assertEquals("A",word);
    }
}