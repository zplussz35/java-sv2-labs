package chars;

public class WhiteSpace {

    public String makeWhitespaceToStar(String text){
        char[] letters = text.toCharArray();
        for(int i=0;i<letters.length;i++){
            if(Character.isWhitespace(letters[i])){
                letters[i]='*';
            }
        }
        return new String(letters);
    }

    public static void main(String[] args) {
        WhiteSpace whiteSpace= new WhiteSpace();
        String text="Egyszer volt, hol nem volt...";
        System.out.println(whiteSpace.makeWhitespaceToStar(text));
    }
}
