package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner sc = new Scanner(System.in);
        System.out.print("Your name: ");
        client.name=sc.nextLine();
        System.out.print("Year of birth: ");
        client.year=sc.nextInt();
        sc.nextLine();
        System.out.print("Address: ");
        client.address=sc.nextLine();

        System.out.println("Your data:");
        System.out.println("-name: "+client.name);
        System.out.println("-year of birth: "+client.year);
        System.out.println("-address: "+client.address);
    }
}
