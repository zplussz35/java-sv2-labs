package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int sum=0;
        for(int i = 0;i<5;i++){
            System.out.print("give an integer: ");
            n=sc.nextInt();
            sc.nextLine();
            sum+=n;
        }
        System.out.println("Sum: "+sum);
    }
}
