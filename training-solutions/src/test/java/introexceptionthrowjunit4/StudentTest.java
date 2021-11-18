package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {
    Student s = new Student();

    @Test
    public void testAddNotes(){

        s.addNotes(5);
        assertThat(5,equalTo(s.getNotes().get(0)));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testAddNotesWithWrongNotes(){
        s.addNotes(7);

    }
    @Rule
    public ExpectedException expectedException=ExpectedException.none();

    @Test
    public void testAddNotesWithWrongNotesRule(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Note must be between 1 and 5!");
        s.addNotes(110);
    }

    @Test
    public void testAddNotesWithAssertThrow(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,()->s.addNotes(100));
        assertThat("Note must be between 1 and 5!",equalTo(ex.getMessage()));
    }

}