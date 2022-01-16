package exceptionclass.bank;

public class Account {
    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if(accountNumber==null){
            throw new IllegalArgumentException("account number cannot be null!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100_000.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        this.maxSubtract = maxSubtract;
    }

    public void subtract(double value){
        if(value>maxSubtract||value<1){
            throw new InvalidAmountBankOperationException("Cannot subtract more than"+maxSubtract+" or less than 1!");
        }
        if(value>balance){
            throw new LowBalanceBankOperationException("There is not that much money!");
        }
        this.balance-=value;
    }
    public void deposit(double value){
        this.balance+=value;
    }
}
