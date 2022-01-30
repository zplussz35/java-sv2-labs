package collectionsmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CastingTest {

    @Test
    void callNextApplicant() {

        Casting c = new Casting();
        Map<Integer,String> applicants = new HashMap<>();
        applicants.put(45,"A");
        applicants.put(35,"B");
        applicants.put(76,"C");
        applicants.put(102,"D");
        applicants.put(10,"E");
        applicants.put(18,"F");
        assertEquals("B",c.callNextApplicant(30,applicants));
    }
}