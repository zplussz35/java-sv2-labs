package defaultconstructor.date;

public class SimpleDateFormatter {
    private CountryCode countryCode;

    public SimpleDateFormatter(){
        this.countryCode=CountryCode.HU;
    }
    public String formatDateString(SimpleDate simpleDate){
        switch (countryCode){
            case HU:
                return simpleDate.getYear()+"-"+simpleDate.getMonth()+"-"+simpleDate.getDay();
            case US:
                return simpleDate.getMonth()+"-"+simpleDate.getDay()+"-"+simpleDate.getYear();
            case EN:
                return simpleDate.getDay()+"-"+simpleDate.getMonth()+"-"+simpleDate.getYear();
            default:
                return "Dont correct date!";
        }
    }
    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        String result="";
        switch (countryCode){
            case EN:
                result= simpleDate.getDay()+"-"+simpleDate.getMonth()+"-"+simpleDate.getYear();
                break;
            case US:
                result= simpleDate.getMonth()+"-"+simpleDate.getDay()+"-"+simpleDate.getYear();
                break;
            case HU:
                result=simpleDate.getYear()+"-"+simpleDate.getMonth()+"-"+simpleDate.getDay();
                break;
            default:
                result="Dont correct countrycode or date";
        }
        return result;
    }
}
