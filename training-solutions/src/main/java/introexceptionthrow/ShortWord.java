package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Adjon meg egy legfeljebb 5 betűs szót: ");
            String word= sc.nextLine();
            if(word.length()>5){
                throw new IllegalArgumentException("5 karakternél hosszab szót adtál meg: "+word);
            }
            System.out.println("A szó: "+word);
        }
        catch (IllegalArgumentException ie){
            System.out.println("Hibaüzenet: "+ie.getMessage());
        }

        System.out.println("End!");
    }
}
