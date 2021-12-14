package constructoroverloading.time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BusTimeTable {
    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable= timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        for (int i = firstHour; i <=lastHour; i++) {
            this.timeTable.add(new SimpleTime(i, everyMinute));
        }
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime getNextBus(SimpleTime actual) {

        for (SimpleTime s : timeTable) {
            if(s.getDifference(actual)>=0){
                return s;
            }
        }
        throw new IllegalStateException("No more buses today!");
    }
}
