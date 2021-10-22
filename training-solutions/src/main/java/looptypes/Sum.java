package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
    public void printSums(int[] numbers){
        List<Integer> sumList = new ArrayList<>();
        int sum=0;
        for (int i = 1; i < numbers.length; i++) {
            sumList.add(numbers[i-1]+numbers[i]);
        }
        System.out.println(sumList.toString());


    }
    public static void main(String[] args) {
        int[] numbers={2, 6, 3, 5, 7, 9};
        Sum sum = new Sum();
        sum.printSums(numbers);
    }
}
