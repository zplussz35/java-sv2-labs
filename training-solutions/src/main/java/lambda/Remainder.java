package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remainder {
    public List<Integer> changeNumbersToRemainders(List<Integer> numbers, int divisor){
        List<Integer> result = new ArrayList<>(numbers);
        result.replaceAll(n->n%divisor);
        return result;

    }

    public static void main(String[] args) {
       Remainder r = new Remainder();
       List<Integer> nums= new ArrayList<>(Arrays.asList(120,200,300,333,244,533,122,533,455,86,97,99));
        System.out.println(r.changeNumbersToRemainders(nums,3));
    }
}
