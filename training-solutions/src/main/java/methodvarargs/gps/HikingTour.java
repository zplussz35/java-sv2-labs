package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {
    private List<FieldPoint> fieldPointList = new ArrayList<>();
    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog){
        if(timeOfLogging==null){
            throw new IllegalArgumentException("Logging tima cannot be null!");
        }
        for (FieldPoint fp: fieldPointsToLog) {
            fp.setTimeOfLogging(timeOfLogging);
            fieldPointList.add(fp);
        }
    }

    public List<FieldPoint> getFieldPointList() {
        return fieldPointList;
    }
}
