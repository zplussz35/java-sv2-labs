package methodoverloading.time;

import java.time.LocalTime;

public class Time {
    private LocalTime time = LocalTime.now();

    public LocalTime getTime(){
        return time;
    }

    public Time(LocalTime time) {
        this.time = time;
    }

    public boolean isEqual(Time time){
        if(this.time==time.time){
            return true;
        }
        return false;
    }
    public boolean isEqual(int hours, int minutes, int seconds){
        if(this.time==LocalTime.of(hours,minutes,seconds)){
            return true;
        }
        return false;
    }
    public boolean isEarlier(Time time){
        if(this.time.isBefore(time.time)){
            return true;
        }
        return false;
    }
    public boolean isEarlier(int hours, int minutes, int seconds){
        if(this.time.isBefore(LocalTime.of(hours,minutes,seconds))){
            return true;
        }
        return false;
    }
}
