package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give an integer: ");
        int n=sc.nextInt();
        sc.nextLine();

        if(n>100){
            System.out.println("Nagyobb, mint száz!");
        }
        else{
            System.out.println("Száz, vagy kisebb!");
        }
    }
}
