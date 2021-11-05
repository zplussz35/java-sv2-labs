package controlselection.month;

public class DayInMonth {
    public int getDayInMonth(int year, String month){
        int dayInMonth;
        switch(month){
            case "január":
                dayInMonth=31;
                break;
            case "február":
                if((year%4==0 && year%100!=0) || year%400==0 ){
                    dayInMonth= 29;
                }
                else{
                    dayInMonth=28;
                }
                break;
            case "március":
                dayInMonth=31;
                break;
            case "április":
                dayInMonth=30;
                break;
            case "május":
                dayInMonth=31;
                break;
            case "június":
                dayInMonth=30;
                break;
            case "július":
            case "augusztus":
                dayInMonth=31;
                break;
            case "szeptember":
                dayInMonth=30;
                break;
            case "október":
                dayInMonth=31;
                break;
            case "november":
                dayInMonth=30;
                break;
            case "december":
                dayInMonth=31;
                break;
            default:
                dayInMonth=0;
        }
        return dayInMonth;
    }

    public static void main(String[] args) {
        DayInMonth d = new DayInMonth();
        System.out.println(d.getDayInMonth(2022,"február"));
    }
}
