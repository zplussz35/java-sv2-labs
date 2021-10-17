package classstructureio;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("WHat is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);

        System.out.println("Year of birth?");
        int yearOfBirth=scanner.nextInt();
        System.out.println("Year of Birth: "+yearOfBirth);
        System.out.println("Age: " + (2021-yearOfBirth));


    }
}
