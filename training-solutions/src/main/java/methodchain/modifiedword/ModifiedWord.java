package methodchain.modifiedword;

public class ModifiedWord {
    public String modify(String word){
        if(word==null || word.length()<4){
            throw new IllegalArgumentException("legalább 4 betűs szót adj meg!");
        }

        return word.toUpperCase().substring(0,3).replace(word.toUpperCase().charAt(1),'x').concat("y");



    }
}
