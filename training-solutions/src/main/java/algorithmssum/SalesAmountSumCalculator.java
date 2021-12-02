package algorithmssum;

import java.util.ArrayList;
import java.util.List;

public class SalesAmountSumCalculator {

    public int sumAmount(List<Salesperson> salespeople){
        int sum=0;
        for (Salesperson n:salespeople) {
            sum+=n.getAmount();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Salesperson> pList= new ArrayList<>();

        pList.add(new Salesperson("Zoltán",100_000));
        pList.add(new Salesperson("Eszter",70_000));
        pList.add(new Salesperson("Bálint",200_000));

        SalesAmountSumCalculator scalc= new SalesAmountSumCalculator();
        System.out.println("All income: "+scalc.sumAmount(pList));

    }
}
