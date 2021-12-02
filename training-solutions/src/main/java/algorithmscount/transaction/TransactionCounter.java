package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {

    public int counterLessThan(List<Transaction> transactions, int max){
        int count=0;
        for (Transaction t:transactions) {
            if(t.isCredit()&&t.getAmount()<max){
                count++;
            }
        }
        return count;
    }
}
