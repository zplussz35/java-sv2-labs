package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Invest sum: ");
        int fund=sc.nextInt();
        sc.nextLine();

        System.out.print("Interest rate: ");
        int interestRate=sc.nextInt();
        sc.nextLine();

        System.out.print("How many days you want to predict yield?: ");
        int days=sc.nextInt();
        sc.nextLine();

        Investment invest = new Investment(fund,interestRate);

        System.out.println("Invest sum: "+invest.getFund());
        System.out.println("Yield in "+days+" days: "+invest.getYield(days));

        System.out.print("How many days later you want to withdraw sum?: ");
        days=sc.nextInt();
        sc.nextLine();
        System.out.println("Withdraw sum in "+days+" days: "+invest.close(days));

        System.out.print("How many days later you want to withdraw sum?: ");
        days=sc.nextInt();
        sc.nextLine();
        System.out.println("Withdraw sum in "+days+" days: "+invest.close(days));
    }
}
