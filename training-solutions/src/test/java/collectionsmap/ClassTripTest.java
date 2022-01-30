package collectionsmap;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {

    @Test
    void loadInPayments() {
        ClassTrip classTrip= new ClassTrip();
        classTrip.loadInPayments(Paths.get("src/test/resources/inpayments.txt"));
        assertEquals(3,classTrip.getTrips().size());
        assertEquals(5000,classTrip.getTrips().get("Nagy Béla"));
    }
}