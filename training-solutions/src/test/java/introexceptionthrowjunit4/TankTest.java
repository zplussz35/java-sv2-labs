package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {

    Tank t = new Tank();

    @Test
    public void testModifyAngle(){
        t.modifyAngle(10);
        assertThat(10,equalTo(t.getAngle()));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testModifyAngleExpected(){
        t.modifyAngle(100);
    }

    @Rule
    public ExpectedException ex = ExpectedException.none();
    @Test
    public void testModifyAngleRule(){
        ex.expect(IllegalArgumentException.class);
        ex.expectMessage("Bigger than 80 angle!");
        t.modifyAngle(120);

    }

    @Test
    public void testModifyAngleAssertThrow(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,()->t.modifyAngle(120));
        assertEquals("Bigger than 80 angle!",ex.getMessage());
    }

}