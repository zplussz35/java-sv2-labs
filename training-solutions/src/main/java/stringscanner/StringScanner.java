package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Adjon meg egy mondatot: ");
        String text=sc.nextLine();
        Scanner wordScanner=new Scanner(text);
        while(wordScanner.hasNext()){
            System.out.print(wordScanner.next()+" ");
        }

        System.out.print("\nAdjon meg egy másik mondatot: ");
        Scanner sc2 =new Scanner(System.in);
        text=sc2.nextLine();
        Scanner scannerByComma=new Scanner(text).useDelimiter(", ");


        while(scannerByComma.hasNext()){

            System.out.print(scannerByComma.next()+" ");
        }
    }
}
