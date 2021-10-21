package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give an integer number: ");
        int n=sc.nextInt();
        sc.nextLine();
        boolean dividableWithThree=n%3==0;

        if(dividableWithThree){
            System.out.println("Dividable with 3!");
        }
        else{
            System.out.println("NOT dividable with 3!");
        }


    }
}
