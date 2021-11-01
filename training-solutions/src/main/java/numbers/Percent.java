package numbers;

import java.util.Scanner;

public class Percent {
    public double getValue(int num1,int num2){
        return num1*(num2/100.0);
    }

    public double getBase(int num1,int num2){
        return ((double)num1/(double)num2)*100;
    }
    public double getPercent(int num1,int num2){
        return ((double)num2/(double)num1)*100;
    }

    public static void main(String[] args) {
        Percent p = new Percent();
        Scanner sc = new Scanner(System.in);
        System.out.print("Melyik számot vizsgáljuk?: ");
        int num1=sc.nextInt();
        sc.nextLine();
        System.out.print("Hány szézalékra kíváncsi?: ");
        int num2=sc.nextInt();
        sc.nextLine();
        System.out.println(num1+"-nak/nek a/az "+num2+"%-a: "+p.getValue(num1,num2));
        System.out.print("százalék: ");
        num2= sc.nextInt();
        sc.nextLine();
        System.out.print("Százalék értéke: ");
        num1= sc.nextInt();
        sc.nextLine();
        System.out.println("Az eredeti szám: "+p.getBase(num1,num2)+", melynek "+num1+" az a "+num2+"%-a.");

        System.out.print("Adja meg az 1. számot: ");
        num1= sc.nextInt();
        sc.nextLine();
        System.out.print("Adja meg a 2. számot: ");
        num2= sc.nextInt();
        sc.nextLine();
        System.out.println(num1+"-nek  a "+num2+": "+p.getPercent(num1,num2)+"%-a!");
    }
}
