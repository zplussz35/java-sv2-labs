package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour,minute,second;
        System.out.print("First time:\n*Hour: ");
        hour=sc.nextInt();
        sc.nextLine();
        System.out.print("*minute: ");
        minute=sc.nextInt();
        sc.nextLine();
        System.out.print("*Second: ");
        second=sc.nextInt();
        sc.nextLine();
        Time time1= new Time(hour,minute,second);

        System.out.print("Second time:\n*Hour: ");
        hour=sc.nextInt();
        sc.nextLine();
        System.out.print("*minute: ");
        minute=sc.nextInt();
        sc.nextLine();
        System.out.print("*Second: ");
        second=sc.nextInt();
        sc.nextLine();
        Time time2= new Time(hour,minute,second);

        System.out.println("First time: "+time1.toString()+" = "+time1.getInMinutes());
        System.out.println("Second time: "+time2.toString()+" = "+time1.getInSeconds());
        System.out.println("First is earlier than second?: "+time1.earlierThan(time2));


    }
}
