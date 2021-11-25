package introexceptionfinally;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Adjon meg egy páros számot: ");
            int n = sc.nextInt();
            sc.nextLine();
            while(n%2!=0){
                System.out.print("Adjon meg egy páros számot: ");
                n = sc.nextInt();
                sc.nextLine();
            }
        }
        catch (NumberFormatException nfe){
            throw new IllegalArgumentException("Not a nubmer!",nfe);
        }
        finally {
            System.out.println("End of round.");
        }


    }
}
