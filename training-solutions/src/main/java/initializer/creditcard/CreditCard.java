package initializer.creditcard;


import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private long balance;
    private static final List<Rate> rates;

    static{
        List<Rate> ratesList=new ArrayList<>();
        ratesList.add(new Rate(Currency.CHF,289.24));
        ratesList.add(new Rate(Currency.EUR,308.23));
        ratesList.add(new Rate(Currency.GBP,362.23));
        ratesList.add(new Rate(Currency.USD,289.77));
        ratesList.add(new Rate(Currency.HUF,1.0));
        rates=ratesList;
    }


    public CreditCard(long balance, Currency currency){
        switch (currency){
            case HUF:
                this.balance=balance;
                break;
            case EUR:
                this.balance=balance*367;
                break;
            case CHF:
                this.balance=balance*352;
                break;
            case GBP:
                this.balance=balance*430;
                break;
            case USD:
                this.balance=balance*325;
                break;
            default:
                this.balance=0L;
        }

    }
    public CreditCard(long balance){
        this.balance=balance;
    }

    public long getBalance(){
        return balance;
    }
    public boolean payment(long amount, Currency currency){
        for (Rate r:rates) {
            if(r.getCurrency()==currency&&amount*r.getConversionFactor()<=balance){
                balance-=amount* r.getConversionFactor();
                return true;
            }
        }
        return false;

    }
    public boolean payment(long amount){
        if(amount<=balance){
            balance-=amount;
            return true;
        }
    return false;
    }
}
