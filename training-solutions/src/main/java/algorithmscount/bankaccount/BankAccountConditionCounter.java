package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {

    public static int countWithBalanceGreaterThan(List<BankAccount> accounts, int min){
        int count=0;
        for (BankAccount b:accounts) {
            if(b.getBalance()>min){
                count++;
            }
        }
        return count;
    }
}
