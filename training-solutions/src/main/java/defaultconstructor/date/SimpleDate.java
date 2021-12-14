package defaultconstructor.date;

public class SimpleDate {
    private int year;
    private int month;
    private int day;


    public void setDate(int year, int month, int day) {
        if (!isCorrect(year, month, day)) {
            throw new IllegalArgumentException("One or more given parameter cannot be applied! "+year+", "+month+", "+day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private boolean isCorrect(int year, int month, int day) {
        if(year<1900||month<0||month>12||day<0){
            return false;
        }
        return calculateMonthLength(year, month) - day >= 0;
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0;
    }

    private int calculateMonthLength(int year, int month) {
        if (isLeapYear(year)) {
            if (month == 2) {
                return 29;
            } else if ((month % 2 == 1 && month < 8) || month % 2 == 0 && month >= 8) {
                return 31;
            } else {
                return 30;
            }
        } else {
            if (month == 2) {
                return 28;
            } else if ((month % 2 == 1 && month < 8) || month % 2 == 0 && month >= 8) {
                return 31;
            } else {
                return 30;
            }
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
