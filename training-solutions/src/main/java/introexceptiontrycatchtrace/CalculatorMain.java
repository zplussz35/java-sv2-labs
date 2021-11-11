package introexceptiontrycatchtrace;


import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Adj meg egy számot: ");
            int n1=sc.nextInt();
            sc.nextLine();
            System.out.print("Adj meg mégegy számot: ");
            int n2=sc.nextInt();
            sc.nextLine();
            System.out.print("Add meg a műveletet: ");
            String m=sc.nextLine();
            Calculator c = new Calculator();
            System.out.println(n1+m+n2+"="+c.calculate(n1,n2,m));
        }
        catch (ArithmeticException ae){
            System.out.println("Nullával osztás!");
            System.out.println("Hibaüzenet: "+ae.getMessage());
        }
        catch (InputMismatchException inpute){
            System.out.println("Nem számot adtál meg!");
            System.out.println("Hibaüzenet: "+inpute.getMessage());
        }

    }
}
