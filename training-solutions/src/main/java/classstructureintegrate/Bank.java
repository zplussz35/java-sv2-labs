package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Making account:\n*name: ");
        String name= sc.nextLine();
        System.out.print("*account number: ");
        String accountNumber=sc.nextLine();
        System.out.print("*balance: ");
        int balance=sc.nextInt();
        sc.nextLine();
        BankAccount bankAccount= new BankAccount(accountNumber,name,balance);
        System.out.println("Your account info:\n"+bankAccount.getInfo());
        System.out.print("How many deposit?: ");
        bankAccount.deposit(sc.nextInt());
        sc.nextLine();
        System.out.println("Your account info:\n"+bankAccount.getInfo());
        System.out.print("How many withdraw: ");
        bankAccount.withdraw(sc.nextInt());
        sc.nextLine();
        System.out.println("Your account info:\n"+bankAccount.getInfo());

    }
}
