package recursion.palindrome;

public class Palindrome {
    public boolean isPalindrome(String word){
        if(word.length()==0){
            return true;
        }
        else if(word.length()==1){
            return true;
        }
        else{
            if(word.charAt(0)==word.charAt(word.length()-1)){
                return isPalindrome(word.substring(1,word.length()-1));
            }
            else{
                return false;
            }
        }
    }
}
