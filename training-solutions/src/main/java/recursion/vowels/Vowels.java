package recursion.vowels;

public class Vowels {
    public int getNumberOfVowels(String word){
       String vowels="aáeéiíoóöőuúüű";
       if(word.length()==0){
           return  0;
       }
       else if(vowels.indexOf(word.charAt(0))>=0){
           return 1 + getNumberOfVowels(word.substring(1));
       }
       else{
           return getNumberOfVowels(word.substring(1));
       }
    }
}
