package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void testContainsLongerWord() {
        List<String> words = Arrays.asList("alma","tányér","sütőtök","madárijesztő");
        assertTrue(new Word().containsLongerWord(words,"szilva"));
    }
}