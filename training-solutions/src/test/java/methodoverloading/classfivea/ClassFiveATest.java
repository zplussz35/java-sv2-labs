package methodoverloading.classfivea;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    @Test
    void getTodayReferringStudent() {
        ClassFiveA c = new ClassFiveA(Arrays.asList("Zoltán","László","Krisztina"));
        assertEquals("László",c.getTodayReferringStudent(2));
        assertEquals("Krisztina",c.getTodayReferringStudent(Number.THREE));
        assertEquals("Zoltán",c.getTodayReferringStudent("one"));
    }
}