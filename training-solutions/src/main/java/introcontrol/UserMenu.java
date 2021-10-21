package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Múvelet: ");
        int control=sc.nextInt();
        sc.nextLine();

        if(control==1){
            System.out.println("Felhasználók listázása");
        }
        else if(control==2){
            System.out.println("Felhasználók felvétele");
        }
        else{
            System.out.println("");
        }





    }


}
