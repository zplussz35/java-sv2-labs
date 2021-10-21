package arrayofarrays;

import java.util.Scanner;

public class Triangular {
    int[][] triangularMatrix(int size){
        int a[][]= new int[size][];
        for (int i = 0; i < size; i++) {
            a[i]=new int[i+1];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=i;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many lines?: ");
        int lines=sc.nextInt();
        sc.nextLine();

        Triangular triangular = new Triangular();
        int[][] triange=triangular.triangularMatrix(lines);
        for (int i = 0; i < triange.length; i++) {
            for (int j = 0; j < triange[i].length; j++) {
                System.out.print(triange[i][j]+" ");
            }
            System.out.println();
        }

    }
}
