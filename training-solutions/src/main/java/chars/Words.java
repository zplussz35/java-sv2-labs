package chars;

public class Words {

    public String pushWord(String word){

        char[] letters = word.toCharArray();
        for(int i=0;i<letters.length;i++){
            letters[i]=(char)(letters[i]+1);
        }
        return new String(letters);
    }

    public static void main(String[] args) {
        String word = "Alma";
        Words words = new Words();
        System.out.println(words.pushWord(word));
    }
}
