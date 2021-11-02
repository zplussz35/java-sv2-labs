package stringbuilder;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeValidator {
    public boolean isPalindrome(String word){
        String formattedWord=word.trim().toLowerCase();
        StringBuilder sb = new StringBuilder(formattedWord);
        if(sb.reverse().toString().equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromeValidator p = new PalindromeValidator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy szót: ");
        String word=sc.nextLine();
        if(p.isPalindrome(word)){
            System.out.println("Palindróma!");
        }
        else{
            System.out.println("NEM palindróma!");
        }

    }
}
