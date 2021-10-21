package introcontrol;

import java.util.Scanner;

public class BoatRental {
    private int boatFive=5;
    private int boatThree=3;
    private int boatTwo=2;

    public BoatRental(int people){


        if(people<3){
            System.out.println("Kettes csónakot vitték el, és "+
                    (boatThree+boatFive)+" db hely maradt és 2  csónak!");
        }
        else if(people<4){
            System.out.println("hármas csónakor vitték el, és "+
                    (boatFive+boatTwo)+" db hely maradt és 2 csónak!");
        }
        else if(people<5){
            System.out.println("Ötös csónakot vitték el, és "+
                    (boatThree+boatTwo)+" db hely maradt és 2 csónak!");
        }
        else if(people<6){
            System.out.println("Ötös csónakot vitték el, és "+
                    (boatThree+boatTwo)+" db hely maradt és 2 csónak!");
        }
        else if(people<7){
            System.out.println("Ötös és kettes csónakokat vitték el, és "+
                    boatThree+" db hely maradt és 1 csónak!");
        }
        else if(people<8){
            System.out.println("Ötös és kettes csónakokat vitték el, és "+
                    boatThree+" db hely maradt és 1 csónak!");
        }
        else if(people<9){
            System.out.println("Ötös és hármas csónakokat vitték el, és "+
                    boatTwo+" db hely maradt és 1 csónak!");
        }
        else if(people<11){
            System.out.println("Ötös és hármas és kettes csónakokat vitték el, és"
                    +"0 db hely maradt és 0 csónak!");
        }
        else{
            System.out.println("Minden csónak elfogyott és még maradtak a parton!");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people?: ");
        int n=sc.nextInt();
        sc.nextLine();

        BoatRental boatRental= new BoatRental(n);
    }
}
