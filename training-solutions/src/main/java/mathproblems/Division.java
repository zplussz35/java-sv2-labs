package mathproblems;

import java.util.Scanner;

public class Division {
    public  void getDivisors(int number){
        System.out.println(number+" osztója: 1");
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                System.out.println(number+" osztója: "+i);
            }
        }
        System.out.println(number+" osztója: "+number);
    }

    public void getRightNumbers(int[] numbers){
        System.out.print(numbers[1]+" ");
        for(int i=2;i<numbers.length;i++){
            if(numbers[i]%i==0){
                System.out.print(numbers[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Division div = new Division();
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy tetszőleges egész számot: ");
        int num=sc.nextInt();
        sc.nextLine();
        div.getDivisors(num);

        System.out.print("Hány számot akar megadni: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] numbers = new int[n];
        for(int i=0;i<numbers.length;i++){
            System.out.print((i+1)+". szam: ");
            num=sc.nextInt();
            sc.nextLine();
            numbers[i]=num;
        }

        System.out.println("Amely számok oszthatóak az indexükkel: ");
        div.getRightNumbers(numbers);
    }
}
