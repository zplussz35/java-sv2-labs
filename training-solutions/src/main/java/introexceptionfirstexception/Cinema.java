package introexceptionfirstexception;

import java.util.List;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        output.append("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:\n");
        System.out.print("Vásárló neve: ");
        String name=sc.nextLine();
        System.out.print("Film címe: ");
        String title=sc.nextLine();
        System.out.print("Hány jegyet kér?: ");
        int nubmerOfTicket=sc.nextInt();
        sc.nextLine();

        output.append("Vásárló neve: "+name+"\nFilm címe: "+title+"\n");
        int i=0;
        int row=0;
        int seat=0;
        output.append("Lefoglalt helyek: ");
        while(i<nubmerOfTicket){
            System.out.print("Hanyadik sor?: ");
            row=sc.nextInt();
            sc.nextLine();
            System.out.print("Hanyadik szék?: ");
            seat=sc.nextInt();
            sc.nextLine();

            output.append(row+". sor "+seat+". szék, ");
            i++;
        }
        if(i!=0){
            output.delete(output.length()-2,output.length()-1);
        }

        output.append("\nJó szórakozást!\n");

        System.out.println(output.toString());


    }
}
