package finalmodifier;

import java.util.Scanner;

public class PiMain {
    public static void main(String[] args) {
        Gentleman g = new Gentleman();
        System.out.println("1. Üdvözlés:\r\n"+g.sayHello("Zoltán"));

        CircleCalculator c = new CircleCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Kör sugara: ");
        double r = Double.parseDouble(sc.nextLine());

        System.out.println(r+" sugarú kör területe: "+c.calculateArea(r));
        System.out.println(r+" sugarú kör kerülete: "+c.calculatePerimeter(r));

        CylinderCalculator cy = new CylinderCalculator();
        System.out.print("Henger sugara: ");
        r=Double.parseDouble(sc.nextLine());;

        System.out.print("Henger magassága: ");
        double h=Double.parseDouble(sc.nextLine());;

        System.out.println(r+" sugarú "+h+" magasságú henger térfogata: "+cy.calculateVolume(r,h));
        System.out.println(r+" sugarú "+h+" magasságú henger felszíne: "+cy.calculateSurfaceArea(r,h));


        CylinderCalculatorBasedOnCircle cyc = new CylinderCalculatorBasedOnCircle();
        System.out.print("Henger sugara: ");
        r=Double.parseDouble(sc.nextLine());;

        System.out.print("Henger magassága: ");
        h=Double.parseDouble(sc.nextLine());;

        System.out.println(r+" sugarú "+h+" magasságú henger térfogata: "+cyc.calculateVolume(r,h));
        System.out.println(r+" sugarú "+h+" magasságú henger felszíne: "+ cyc.calculateSurfaceArea(r,h));

        System.out.println("PI értéke: "+CircleCalculator.PI);


    }
}
