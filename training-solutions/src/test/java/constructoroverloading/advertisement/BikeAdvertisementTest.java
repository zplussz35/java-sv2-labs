package constructoroverloading.advertisement;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BikeAdvertisementTest {
    @Test
    void create(){
        BikeAdvertisement b = new BikeAdvertisement("leírás",120_000,"Mountain");
        assertEquals("leírás",b.getDescription());
        assertEquals(120_000,b.getPrice());
        assertEquals("Mountain",b.getBrand());

        BikeAdvertisement b2 = new BikeAdvertisement("leírás",150_000, List.of("Gumi","hajtás"),"Mountain","123456");
        assertEquals("leírás",b2.getDescription());
        assertEquals(150_000,b2.getPrice());
        assertEquals("Mountain",b2.getBrand());
        assertEquals("hajtás",b2.getExtras().get(1));
        assertEquals("123456",b2.getSerialNumber());
    }

}