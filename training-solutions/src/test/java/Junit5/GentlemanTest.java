package Junit5;

import junit5.Gentleman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {
    @Test
    void createTest(){
        assertEquals("Hello John Doe!",new Gentleman().sayHello("John Doe"));
        assertEquals("Hello Anonymous!",new Gentleman().sayHello(null));
    }
}
