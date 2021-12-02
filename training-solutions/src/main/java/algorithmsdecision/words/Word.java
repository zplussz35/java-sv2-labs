package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> words, String thisWord){
        for (String w:words) {
            if(w.length()>thisWord.length()){
                return true;
            }
        }
        return false;

    }
}
