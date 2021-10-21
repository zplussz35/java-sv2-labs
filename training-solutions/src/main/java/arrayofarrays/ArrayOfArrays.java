package arrayofarrays;

public class ArrayOfArrays {
    public void printArrayOfArrays(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        int[][] a = new int[4][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=j;
            }
        }
        arrayOfArrays.printArrayOfArrays(a);
    }
}
