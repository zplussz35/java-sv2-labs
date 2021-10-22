package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<>();
        int[] ints = { 3, 9, 42, 67, 4, 0, 76, 14, 84, 35, 92};
        System.out.println("Minden 2. szám a listában:");
        for (int i = 0; i < ints.length; i++) {
            ilist.add(ints[i]);
            if(i%2==1){
                System.out.print(ilist.get(i)+" ");
            }
        }
    }
}
