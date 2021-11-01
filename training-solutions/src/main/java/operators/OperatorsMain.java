package operators;

import java.util.Scanner;

public class OperatorsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operators op= new Operators();
        System.out.print("Adjon meg egy tetszőleges egész számot: ");
        int num=sc.nextInt();
        sc.nextLine();
        System.out.println(num+" ketes számrendszerben: "+op.intToBinary(num));

        System.out.print("Adj meg egy tetszőleges egész  számot: ");
        num=sc.nextInt();
        sc.nextLine();
        if(op.isEven(num)){
            System.out.println(num+" páros!");
        }
        else{
            System.out.println(num+" páratlan!");
        }

        System.out.print("Adjon meg az osztandót: ");
        num=sc.nextInt();
        sc.nextLine();
        System.out.print("Adja meg az osztót: ");
        int num2=sc.nextInt();
        sc.nextLine();
        System.out.println(op.getResultOfDivision(num,num2));

        String text=null;
        System.out.print("Adjon meg egy tetszőleges szöveget: ");
        String text2=sc.nextLine();
        System.out.println("Az első szöveg: "+op.isNull(text));
        System.out.println("Az ön szövege: "+op.isNull(text2));

        System.out.println("Az első szöveg üres vagy null?: "+op.isEmpty(text));
        System.out.println("Az ön szövege üres vagy null?: "+op.isEmpty(text2));




    }
}
