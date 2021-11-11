package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Validation valid = new Validation();
        String name="";
        String ageString="";
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Üdvözöljük!");
            System.out.print("Neve: ");
            name = sc.nextLine();
            valid.validateName(name);
        } catch (Exception e) {
            name="";
            System.out.println("Hibaüzenet: " + e.getMessage());
        }

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Életkora: ");
            ageString = sc.nextLine();
            valid.validateAge(ageString);
        } catch (Exception e) {
            ageString="";
            System.out.println("Hibaüzenet: " + e.getMessage());
        }

            System.out.println("Az ön adatai:");
            System.out.println("Neve: "+name);
            System.out.println("Kora: "+ageString);
            if("".equals(ageString)||"".equals(name)){
                System.out.println("A regisztráció sikertelen!");
            }
            else{
                System.out.println("A regisztráció sikeres!");
            }
        }
    }
