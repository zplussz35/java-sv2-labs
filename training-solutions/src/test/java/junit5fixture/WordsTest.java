package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class WordsTest {

    Words words;

    @BeforeEach
    void init(){
        words= new Words();
        words.addWord("alma");
        words.addWord("arra");
        words.addWord("ara");
        words.addWord("asztal");
        words.addWord("béla");
        words.addWord("barna");
        words.addWord("sárgaság");
        words.addWord("sárospatak");
        words.addWord("cékla");
        words.addWord("cérnametélt");
    }

    @Test
    void testGetWordsStartWith(){
        List<String> result = new ArrayList<>(Arrays.asList("alma","arra","ara","asztal"));
        words.getWordsStartWith("a");
        assertEquals(result,words.getWords());
    }
    @Test
    void testGetWordsWithLength(){
        List<String> result = new ArrayList<>(Arrays.asList("alma","arra","béla"));
        words.getWordsWithLength(4);
        assertEquals(result,words.getWords());
    }

}
