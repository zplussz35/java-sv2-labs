package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void getFirstTwoLetters() {
        List<String> words = Arrays.asList("alma","körte","szilva","batack","mandarin");
        assertEquals("kö",new TwoLetters().getFirstTwoLetters(words).get(1));
        assertEquals("ma",new TwoLetters().getFirstTwoLetters(words).get(4));
    }
}