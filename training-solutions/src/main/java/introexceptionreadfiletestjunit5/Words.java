package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {
    public String getFirstWordWithA(Path path){
        List<String> lines = getFile(path);

        for (String s :lines) {
            if(s.charAt(0)=='a' || s.charAt(0)=='A'){
                return s;
            }
        }
        return "A";
    }

    private List<String> getFile(Path path){
        try{
            return Files.readAllLines(path);
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can no open file",ioe);
        }
    }
}
