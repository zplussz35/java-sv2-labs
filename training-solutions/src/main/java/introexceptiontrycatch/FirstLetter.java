package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLetter {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("alma","banán","","ablak","csirke","bor"));
        try{
            for (String s:words) {
                System.out.print(s.charAt(0)+" ");
                System.out.println();
            }


        }
        catch (StringIndexOutOfBoundsException se){
            System.out.println("Üres String került megadásra!");
            System.out.println(se.getMessage());
            se.printStackTrace();
        }

        System.out.println("End!");

    }

}
