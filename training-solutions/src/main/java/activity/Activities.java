package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {
    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }
    public void addActivity(Activity activity){
        activities.add(activity);
    }
    public List<Report> distancesByTypes(){
        List<Report> result=new ArrayList<>();
        for (Activity act:activities) {
            if(act.getClass()==ActivityWithTrack.class){
                result.add(new Report(act.getType(),act.getDistance()));
            }
            else{
                result.add(new Report(act.getType(),0));
            }

        }
        return result;
    }
    public int numberOfTrackActivities(){
        int count=0;
        for (Activity act:activities) {
            if(act.getClass()==ActivityWithTrack.class){
                count++;
            }
        }
        return count;
    }
    public int numberOfWithoutTrackActivities(){
        int count=0;
        for (Activity act:activities) {
            if(act.getClass()==ActivityWithoutTrack.class){
                count++;
            }
        }
        return count;
    }
}
