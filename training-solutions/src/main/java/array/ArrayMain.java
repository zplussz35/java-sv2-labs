package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] weekDays= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(weekDays[1]+". Days count in week: "+weekDays.length);

        int[] two = new int[5];
        int n=1;
        for (int i = 0; i < 5; i++) {
            two[i]=n;
            n*=2;
        }
        for (int e:two) {
            System.out.print(e+" ");
        }
        System.out.println();

        boolean[] bArray = new boolean[6];
        boolean c =false;
        for (int i = 0; i < 6; i++) {
            bArray[i]=c;
            c=!c;
        }
        for (boolean b:bArray) {
            System.out.print(b+" ");

        }
    }
}
