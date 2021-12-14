package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testCreate(){
        PublicVehicle p1 = new Bus(10,20,"buszmárka");
        PublicVehicle p2 = new Tram(10,20,4);
        PublicVehicle p3 = new Metro(10,20,15);
        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(p1);
        publicTransport.addVehicle(p2);
        publicTransport.addVehicle(p3);
        assertEquals(3,publicTransport.getVehicles().size());
    }
}