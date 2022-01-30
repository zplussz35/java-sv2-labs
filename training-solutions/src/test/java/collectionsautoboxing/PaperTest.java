package collectionsautoboxing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperTest {
    Paper p = new Paper();

    @BeforeEach
    void setUp(){

        p.putFurtherPaper("A",400);
        p.putFurtherPaper("B",200);
        p.putFurtherPaper("V",100);
        p.putFurtherPaper("A",500);
        p.putFurtherPaper("V",600);
        p.putFurtherPaper("A",100);
    }

    @Test
    void putFurtherPaper() {
        assertEquals(3,p.getClassResults().size());
        assertEquals(1000,p.getClassResults().get("A"));
    }

    @Test
    void getWinnerClass() {
        assertEquals("A",p.getWinnerClass());

    }

    @Test
    void getTotalWeight() {
        assertEquals(1900,p.getTotalWeight());
    }
}