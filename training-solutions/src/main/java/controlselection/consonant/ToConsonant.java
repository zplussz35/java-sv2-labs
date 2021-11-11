package controlselection.consonant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToConsonant {

    private final List<Character> MSH= Arrays.asList('b','c','d','f','g','h','j','k','l','m',
            'n','p','q','r','s','t','v','w','x','y','z',
            'B','C','D','F','G','H','J','K','L','M',
            'N','P','Q','R','S','T','V','W','X','Y','Z');
    private final List<Character> MGH= Arrays.asList('a','e','i','o','u','A','E','I','O','U');
    public char toConsonant(char c) {
        for (char ch: MSH) {
            if(c==ch){
                return c;
            }
        }

        for (char ch: MGH) {
            if(c==ch){
                return (char)(c+1);
            }
        }
        return '0';
    }

    public static void main(String[] args) {
        ToConsonant con= new ToConsonant();

        System.out.println(con.toConsonant('Z'));
    }
}
