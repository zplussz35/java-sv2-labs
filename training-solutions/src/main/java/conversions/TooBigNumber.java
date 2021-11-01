package conversions;

import java.util.Scanner;

public class TooBigNumber {
    public static final int BIGNUM= 2_147_483_647;

    public long getRightResult(int number){
        return (long) BIGNUM+number;
    }

    public static void main(String[] args) {
        TooBigNumber tooBigNumber= new TooBigNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy pozitív egész számot: ");
        int  num= sc.nextInt();
        sc.nextLine();
        System.out.println("A legnagyobb szám("+TooBigNumber.BIGNUM+") +"+num+"="+tooBigNumber.getRightResult(num));
    }
}
