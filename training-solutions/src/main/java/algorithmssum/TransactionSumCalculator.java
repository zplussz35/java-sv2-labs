package algorithmssum;

import java.util.ArrayList;
import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions){
        int sum=0;
        for (Transaction t:transactions) {
            if(t.getTransactionOperation()==TransactionOperation.CREDIT){
                sum+=t.getAmount();
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        List<Transaction> tList= new ArrayList<>();
        tList.add(new Transaction("1--23415",TransactionOperation.CREDIT,120_000));
        tList.add(new Transaction("1--23415",TransactionOperation.DEBIT,120_000));
        tList.add(new Transaction("1--23415",TransactionOperation.DEBIT,120_000));
        tList.add(new Transaction("1--23415",TransactionOperation.CREDIT,120_000));

        TransactionSumCalculator tCalc = new TransactionSumCalculator();
        System.out.println(tCalc.sumAmountOfCreditEntries(tList));
    }
}
