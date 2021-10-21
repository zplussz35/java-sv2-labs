package arrayofarrays;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Rectangle {
    public int[][] rectangularMatrix(int size){
        int[][] a = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j]=i;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many lines?: ");
        int lines=sc.nextInt();
        sc.nextLine();

        Rectangle rect = new Rectangle();

        int[][] a=rect.rectangularMatrix(lines);

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines; j++) {
                System.out.print(a[i][j]+" ");;
            }
            System.out.println();
        }


    }
}
