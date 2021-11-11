package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy pozitív számot: ");
        int n = sc.nextInt();
        sc.nextLine();
        if(n<1){
            throw new IllegalArgumentException("Nem pizitív szám: "+n);
        }
        System.out.println("A szám: "+n);
        System.out.println("End!");
    }
}
