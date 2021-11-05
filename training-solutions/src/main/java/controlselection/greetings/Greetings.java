package controlselection.greetings;

import java.util.Arrays;

public class Greetings {

    public void correctGreetings(int hour,int minute){
        int time= hour*60+minute;
        if(time<300){
            System.out.println("Jó éjt!");
        }
        else if(time<540){
            System.out.println("Jó reggelt!");
        }
        else if(time<1111){
            System.out.println("Jó naptot!");
        }
        else if(time<1201){
            System.out.println("jó estét!");

        }
        else{
            System.out.println("jó éjt!");
        }
    }

    public static void main(String[] args) {
        Greetings g = new Greetings();
        g.correctGreetings(10,10);
    }
}
