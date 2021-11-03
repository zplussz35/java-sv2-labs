package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in).useDelimiter(", ");
        System.out.print("Adjon meg egy mondatot: ");
        String text;
        while(sc.hasNextLine()){
            System.out.print(sc.next()+" ");
        }

        Scanner sc2 =new Scanner(System.in).useDelimiter(", ");
        System.out.print("Adjon meg egy másik mondatot: ");
        String text2 = sc2.nextLine();

        while(sc2.hasNext()){

            System.out.print(sc2.next()+" ");
        }
    }
}
