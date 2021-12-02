package algorithmsdecision.bankaccounts;

public class BankAccount {
    private String nameOfOwner;
    private String accountNumber;
    private int amount;

    public BankAccount(String nameOfOwner, String accountNumber, int amount) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void deposit(int sum){
        this.amount+=sum;
    }
    public int withdraw(int sum){
        this.amount-=sum;
        return sum;
    }
}
