package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mennyi a következő kifejezés eredménye?(Tizedes vesszőt használjon!):");
        System.out.println("2/3+4-7/6+6*4=?");
        System.out.print("Megoldás: ");
        double solution=sc.nextDouble();
        sc.nextLine();


        double realSolution=2/3D+4-7/6D+6*4;

        if(Math.abs(realSolution-solution)<1.0e-15){
            System.out.println("Helyes megoldás: "+solution);
        }
        else{
            System.out.println("Helytelen megoldás: "+solution+"\nHelyes megoldás: "+realSolution);
        }

    }
}
