package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FieldPointTest {

    @Test
    void init(){
        FieldPoint fp = new FieldPoint(LocalDateTime.of(2021,11,12,20,34),125,124.5);
        assertEquals(LocalDateTime.of(2021,11,12,20,34),fp.getTimeOfSetting());
        assertEquals(125,fp.getLatitude());
        assertEquals(124.5,fp.getLongitude());
    }

}