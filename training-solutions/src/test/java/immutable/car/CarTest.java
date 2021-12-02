package immutable.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCreateCar() throws IllegalStateException{
        assertThrows(IllegalArgumentException.class,()->new Car(null,null,2021));
    }

}