package exceptionclass.course;

public class InvalidTimeException extends RuntimeException {

    private String hour;
    private String minute;

    public InvalidTimeException(String message,String hour,String minute){
        super(message);
        this.hour=hour;
        this.minute=minute;
    }
    public InvalidTimeException(String message){
        super(message);
    }

    public String getHour() {
        return hour;
    }

    public String getMinute() {
        return minute;
    }
}
