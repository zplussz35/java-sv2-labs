package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codes {
    public StringBuilder getCodesStartWithLetter(List<String> codes){
        List<String> startsWithLetter = new ArrayList<>();
        for (int i = 0; i < codes.size(); i++) {
            if(Character.isAlphabetic(codes.get(i).charAt(0))){
                startsWithLetter.add(codes.get(i));
            }
        }
        StringBuilder sb = new StringBuilder("Betűvel kezdődő kódok: ");
        for (int i = 0; i < startsWithLetter.size(); i++) {
            sb.append(startsWithLetter.get(i));
            if(i<startsWithLetter.size()-1){
                sb.append(", ");
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        List<String> codes = new ArrayList<>(Arrays.asList("534gf","gt4gf","hs34gf","534gf","dah4gf","534gf",
                "hg34gf","534gf","sd34gf","534gf"));
        Codes c = new Codes();
        System.out.println("kódok: "+codes);
        System.out.println(c.getCodesStartWithLetter(codes));

    }
}
