package arrays;

import java.util.Arrays;

public class ArraysMain {
    public String numberOfDaysAsString(){
        int[] numberOfDays={31,28,31,30,31,30,31,31,30,31,30,31};
        return Arrays.toString(numberOfDays);
    }
    public String multiplicationTableAsString(int size){
        int[][] a = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <size ; j++) {
                a[i][j]=(i+1)*(j+1);
            }
        }
        return Arrays.deepToString(a);
    }
    public boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day,anotherDay);
    }
    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay){
        if(day.length>anotherDay.length){
            double[] day2=Arrays.copyOfRange(day,0,anotherDay.length);
            return Arrays.equals(day2,anotherDay);
        }
        else if(day.length<anotherDay.length){
            double[] anotherDay2=Arrays.copyOfRange(anotherDay,0,day.length);
            return Arrays.equals(anotherDay2,day);
        }
       return Arrays.equals(day,anotherDay);
    }
    public boolean wonLottery(int[] a, int[] b){
        int[] acopy= Arrays.copyOf(a,a.length);
        int[] bcopy= Arrays.copyOf(b,b.length);
        Arrays.sort(acopy);
        Arrays.sort(bcopy);
        return Arrays.equals(acopy,bcopy);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println(arraysMain.multiplicationTableAsString(5));
        double[] temps1 = {30,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,
        18,19,20,21,22,23,24};
        double[] temps2 = {30,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,
                18,19,20,21,22,23,24,25};
        System.out.println(arraysMain.sameTempValues(temps1,temps2));
        System.out.println(arraysMain.sameTempValuesDaylight(temps1,temps2));
        int[]  lutry={4,2,3,1,5};
        int[] lutryWin={5,4,3,2,1};
        System.out.println("Lutri vizsgálat előtt:");
        System.out.println(Arrays.toString(lutry));
        System.out.println(Arrays.toString(lutryWin));
        System.out.println(arraysMain.wonLottery(lutry,lutryWin));

        System.out.println("Lutri vizsgálat után:");
        System.out.println(Arrays.toString(lutry));
        System.out.println(Arrays.toString(lutryWin));

    }
}
