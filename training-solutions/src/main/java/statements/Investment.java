package statements;

public class Investment {
    private double cost=0.003;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund,int interestRate){
        this.fund=fund;
        this.interestRate=interestRate;
        active=true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days){
        return fund*((double)interestRate/100)*((double)days/365);

    }

    public double close(int days){
        if(active){
            active=false;
            return (fund+getYield(days))*(1-cost);
        }
        else{
            return 0.0;

        }
    }

}
