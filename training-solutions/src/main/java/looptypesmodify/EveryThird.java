package looptypesmodify;

import java.util.Arrays;

public class EveryThird {
    public int[] changeToZero(int[] numbers){
        int temp[] = numbers;
        for (int i = temp.length-1;i >0 ; i-=3) {
            temp[i]=0;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] numbers={2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};
        EveryThird everyThird = new EveryThird();
        System.out.println(Arrays.toString(everyThird.changeToZero(numbers)));
    }
}
