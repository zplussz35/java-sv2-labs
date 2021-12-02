package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean  containsBalanceGreaterThan(List<BankAccount> accounts, int min){
        for (BankAccount ba:accounts) {
            if(ba.getAmount()>min){
                return true;
            }
        }
        return false;
    }
}
