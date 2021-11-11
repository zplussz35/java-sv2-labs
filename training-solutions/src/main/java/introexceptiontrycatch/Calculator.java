package introexceptiontrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Adjon meg egy számot: ");
            int n1=sc.nextInt();
            sc.nextLine();
            System.out.print("Adjon meg mégegy számot: ");
            int n2=sc.nextInt();
            sc.nextLine();
            System.out.print("Adjon meg a műveletet: ");
            String m=sc.nextLine();
            switch (m){
                case "+":
                    System.out.println(n1+"+"+n2+"="+(n1+n2));
                    break;
                case "-":
                    System.out.println(n1+"-"+n2+"="+(n1-n2));
                    break;
                case "*":
                    System.out.println(n1+"*"+n2+"="+(n1*n2));
                    break;
                case "/":
                    System.out.println(n1+"/"+n2+"="+((double)n1/n2));
                    break;
                default:
                    System.out.println("nincs ilyen művelet!");
            }
        }
        catch(InputMismatchException ie){
            System.out.println("Nem számot írt be!");
            System.out.println("hibához tartozó szöveg: "+ie.getMessage());
            ie.printStackTrace();
        }




    }
}
