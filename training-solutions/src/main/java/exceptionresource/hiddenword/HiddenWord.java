package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class HiddenWord {
    public String getHiddenWord(Path path){
        try(Scanner sc = new Scanner(path)){
            StringBuilder sb = new StringBuilder();
            boolean foundAlpha=false;
            while(sc.hasNextLine()){
                for (Character c:sc.nextLine().toCharArray()) {
                    if(Character.isAlphabetic(c)){
                        foundAlpha=true;
                        sb.append(c);
                        break;
                    }
                }
                if(!foundAlpha){
                    sb.append(" ");
                }
                foundAlpha=false;

            }
            return sb.toString();

        }catch (IOException ioe){
            throw new IllegalStateException("Can not read file");
        }
    }

    public static void main(String[] args) {
        HiddenWord hiddenWord = new HiddenWord();
        System.out.println(hiddenWord.getHiddenWord(Paths.get("src/test/resources/hiddenword.txt")));
    }
}
