package methodoverloading.time;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void isEqual() {
        LocalTime timeNow=LocalTime.now();
        LocalTime anotherTime = LocalTime.of(12,12,12);
        assertTrue(new Time(timeNow).isEqual(new Time(timeNow)));
        assertFalse(new Time(anotherTime).isEqual(11,11,11));
    }

    @Test
    void isEarlier() {
        LocalTime time1=LocalTime.of(11,11,11);
        LocalTime time2 = LocalTime.of(12,12,12);
        assertTrue(new Time(time1).isEarlier(new Time(time2)));
        assertFalse(new Time(time2).isEarlier(11,11,11));
    }
}