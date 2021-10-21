package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1995,4,30);
        LocalTime startTime=LocalTime.of(18,20);
        LocalTime endTime=LocalTime.of(20,20);
        String artist = "Michael Jackson";

        Performance perf = new Performance(date,artist,startTime,endTime);

        System.out.println(perf.getInfo());
    }
}
