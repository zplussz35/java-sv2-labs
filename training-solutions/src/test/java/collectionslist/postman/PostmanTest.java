package collectionslist.postman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {

    Postman p = new Postman();

    @Test
    void addAddress() {
        p.addAddress("Kovács u. 15");
        p.addAddress("Kovács u. 17");
        p.addAddress("Kovács u. 19");
        p.addAddress("Mária u. 9");

        assertEquals(4,p.getAddresses().size());
        assertEquals("Mária u. 9",p.getAddresses().get(3));
    }

    @Test
    void removeAddress() {
        p.addAddress("Kovács u. 15");
        p.addAddress("Kovács u. 17");
        p.addAddress("Kovács u. 19");
        p.addAddress("Mária u. 9");


        p.removeAddress("Kovács u. 15");
        assertEquals(3,p.getAddresses().size());
        assertEquals("Kovács u. 17",p.getAddresses().get(0));
    }
}