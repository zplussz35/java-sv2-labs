package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        String[] words={"KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ", "FELHŐ",
                        "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA"};
        List<String> listOfWords = new ArrayList<>();
        System.out.println("6 betűs szavak:");
        for (String e:words) {
            listOfWords.add(e);
            if(e.length()==6){
                System.out.print(e+" ");
            }
        }



    }
}
