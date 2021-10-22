package math.math;

import java.util.Random;

public class MathMethods {
    public static void main(String[] args) {
        int x=6,y=7;
        System.out.println("6 és 7 közül a nagyobb: "+Math.max(x,y));
        System.out.println("6 és 7 közül a kisebb: "+Math.min(x,y));
        System.out.println("Pi értéke: "+Math.PI);
        System.out.println("Pi értéke kerekítve: "+Math.round(Math.PI));
        System.out.println("11.8 értéke kerekítve: "+Math.round(11.8));
        System.out.println("-4.24 abszolút értéke: "+(Math.abs(-4.24)));
        System.out.println("1 ellentétje: "+Math.negateExact(1));
        System.out.println("10+20= "+Math.addExact(10,20));
        System.out.println("10-20= "+Math.subtractExact(10,20));
        System.out.println("10*20= "+Math.multiplyExact(10,20));
        System.out.println("10^4= "+Math.pow(10,4));
        System.out.println("10+1= "+Math.incrementExact(10));
        System.out.println("10-1= "+Math.decrementExact(10));
        System.out.println("Véletlen szám 0 és 1 között: "+Math.random());





    }
}
