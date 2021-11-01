package chars;

public class LettersAndDigits {
    public void printLetterOrDigit(String text){
        for(char c :text.toCharArray()){
            if(Character.isAlphabetic(c)){
                System.out.println(c+": betű");
            }
            else if(Character.isDigit(c)){
                System.out.println(c+": szám");
            }
            else{
                System.out.println(c+": egyéb");
            }

        }
    }

    public static void main(String[] args) {
        String text="abc123; #&6ó";
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        lettersAndDigits.printLetterOrDigit(text);
    }
}
