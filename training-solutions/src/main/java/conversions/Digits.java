package conversions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Digits {
    private List<Integer> digits= new ArrayList<>();

    public List<Integer> getDigits() {
        return digits;
    }

    public void addDigitsToList(String text){
        char[] chars = text.toCharArray();

        for(int i=0;i< chars.length;i++){
            if(Character.isDigit(chars[i])){
                digits.add(Integer.parseInt(String.valueOf(chars[i])));
            }
        }
    }

    public static void main(String[] args) {
        Digits digits= new Digits();
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy szöveget mely számokat tartalmaz: ");
        String text=sc.nextLine();
        digits.addDigitsToList(text);
        System.out.println("A számok a szövegből: ");
        System.out.println(digits.getDigits());
    }
}
