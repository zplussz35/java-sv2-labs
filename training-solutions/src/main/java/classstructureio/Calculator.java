package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give 2 numbers (between space): ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        System.out.println(num1 + " + " + num2);
        System.out.println(num1+num2);
    }
}
