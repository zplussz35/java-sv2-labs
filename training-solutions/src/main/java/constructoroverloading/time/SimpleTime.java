package constructoroverloading.time;

public class SimpleTime {
    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes){
        this(hours);
        this.minutes=minutes;
    }
    public SimpleTime(int hours){
        this.hours=hours;
    }
    public SimpleTime(SimpleTime time){
        this(time.getHours(), time.getMinutes());
    }

    public int getDifference(SimpleTime time){
        return this.getHours()*60+this.getMinutes() - (time.getHours()*60 + time.getMinutes());
    }
    public String toString(){
        return this.hours+":"+this.minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
