package methodchain.modifiedword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    @Test
    void modify() {
        String word="almafa";
        ModifiedWord md = new ModifiedWord();
        String modified=md.modify(word);
        assertEquals("AxMy",modified);
    }
}