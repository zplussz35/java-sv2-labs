package typeconversion;

import java.util.Scanner;

public class ConversionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversion con=new Conversion();
        System.out.print("Adjon meg egy ne megész számot (tizedes vessző): ");
        double d=sc.nextDouble();
        sc.nextLine();
        System.out.println(d+" egész része: "+con.convertDoubleToDouble(d));

        System.out.print("Hány számot akar tárolni?: ");
        int db=sc.nextInt();
        sc.nextLine();
        int[] numbers= new int[db];
        int num;
        for(int i=0;i< numbers.length;i++){
            System.out.print((i+1)+". szám: ");
            num=sc.nextInt();
            sc.nextLine();
            numbers[i]=num;
        }
        System.out.println("Az ön számai: ");
        for (int n : numbers) {
            System.out.print(n+" ");
        }

        System.out.println("Ezek közül a 'kis' számok(0-127): ");
        byte[] littleNums= con.convertIntArrayToByteArray(numbers);
        for (byte b : littleNums) {
            System.out.print(b+" ");
        }

        System.out.print("Adjon meg egy nem egész számot(tizedes vessző): ");
        d=sc.nextDouble();
        sc.nextLine();
        System.out.println(d+ " első tizedesjegye: "+con.getFirstDecimal(d));



    }
}
