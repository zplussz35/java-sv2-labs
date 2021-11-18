package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


class StudentTest {
    Student s = new Student();

    @Test
    void testAddNotes(){
        s.addNotes(4);
        assertEquals(4,s.getNotes().get(0));

    }

    @Test
    void testAddNotesWithWrongNotes(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,()->s.addNotes(0));
        assertEquals("Note must be between 1 and 5!",ex.getMessage());
    }

}