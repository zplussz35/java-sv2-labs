package classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber,String owner, int balance){
        this.accountNumber=accountNumber;
        this.owner=owner;
        this.balance=balance;
    }
    public void deposit(int sum){
        balance+=sum;

    }
    public void withdraw(int sum){
        balance-=sum;
    }
    public String getInfo(){
        return owner+" ("+accountNumber+"): "+balance+" Ft";
    }
}
