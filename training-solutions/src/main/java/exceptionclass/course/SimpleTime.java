package exceptionclass.course;

public class SimpleTime {
    private String hour;
    private String minute;

    public SimpleTime(String hour, String minute) {
        if(Integer.parseInt(hour)<0||Integer.parseInt(hour)>23){
            throw new InvalidTimeException("Hour is invalid (0-23)",hour,minute);
        }
        if(Integer.parseInt(minute)<0||Integer.parseInt(minute)>59){
            throw new InvalidTimeException("Minute is invalid (0-23)",hour,minute);
        }
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String time){
        if(time==null){
            throw new InvalidTimeException("Time is null");
        }
        if(!validTime(time)){
            throw new InvalidTimeException("Time is not hh:mm");
        }
        String[] data=time.strip().split(":");
        this.hour=data[0];
        this.minute=data[1];
    }

    private boolean validTime(String time) {
        String[] data=time.strip().split(":");
        if(data.length!=2){
            return false;
        }
        if(data[0].length()>2||data[1].length()>2||data[0].length()==0||data[1].length()==0){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if(hour.length()==2&&minute.length()==2){
            return hour + ":" + minute;
        }
        else if(hour.length()==1&&minute.length()==2){
            return "0"+hour+":"+minute;
        }
        else if(hour.length()==2&&minute.length()==1){
            return hour+":"+"0"+minute;
        }
        else if(hour.length()==1&&minute.length()==1){
            return "0"+hour+":"+"0"+minute;
        }
        else{
            return "cannot be a time!";
        }

    }

    public String getHour() {
        return hour;
    }

    public String getMinute() {
        return minute;
    }
}
