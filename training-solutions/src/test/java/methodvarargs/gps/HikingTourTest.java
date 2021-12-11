package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {
    @Test
    void testLogFieldList(){
        HikingTour ht = new HikingTour();
        ht.logFieldPoints(LocalDateTime.of(2021,11,12,20,24),new FieldPoint(LocalDateTime.of(2021,11,12,19,24),11,12),
                new FieldPoint(LocalDateTime.of(2021,11,12,19,44),21,22),
        new FieldPoint(LocalDateTime.of(2021,11,12,19,54),31,32));
        assertEquals(LocalDateTime.of(2021,11,12,20,24),ht.getFieldPointList().get(0).getTimeOfLogging());
    }

}