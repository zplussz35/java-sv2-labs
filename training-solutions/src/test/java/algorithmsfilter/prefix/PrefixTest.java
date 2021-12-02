package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void getWordsStartWith() {
        List<String> words = Arrays.asList("alma","körte","szilva","almafa","almapite","körtefa");
        assertEquals(3,new Prefix().getWordsStartWith(words,"alma").size());
        assertEquals(2,new Prefix().getWordsStartWith(words,"körte").size());
        assertEquals(0,new Prefix().getWordsStartWith(words,"banán").size());

    }
}