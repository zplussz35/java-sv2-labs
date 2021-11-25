package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Words {
    public String getFirstWordWithA(Path path){

            List<String> words=readFile(path);
            for (String s:words) {
                if(s.charAt(0)=='a' || s.charAt(0)=='A'){
                    return s;
                }
            }
            return "A";
    }

    private List<String> readFile(Path path){
        try{
            List<String> words = Files.readAllLines(Paths.get("src/test/resources/words.txt"));
            return words;

        }
        catch(IOException ioe){
            throw new IllegalStateException("Cannot read file!",ioe);
        }
    }
}
