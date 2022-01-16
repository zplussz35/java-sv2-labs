package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if(accounts==null){
            throw new IllegalArgumentException("accounts is null!");

        }
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void depositAccount(String accountNumber,double value){
        boolean founded=false;
        for (Account acc:accounts) {
            if(acc.getAccountNumber().equals(accountNumber)){
                founded=true;
                acc.deposit(value);
            }
        }
        if(!founded){
            throw new InvalidAccountNumberBankOperationException("Cannot found account number!");
        }
    }

    public void subtractAccount(String accountNumber,double value){
        boolean founded=false;
        for (Account acc:accounts) {
            if(acc.getAccountNumber().equals(accountNumber)){
                founded=true;
                acc.subtract(value);
            }
        }

        if(!founded){
            throw new InvalidAccountNumberBankOperationException("Cannot found account number!");
        }
    }
}
