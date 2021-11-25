package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {

    public void correctBooks(Path path){
        List<String> lines =readFile(path);
        List<String> corrected=new ArrayList<>();
        String[] words;
        for (String s:lines) {
            words=s.split(";");
            corrected.add(words[2]+": "+words[1]);
        }

        try{
            Files.write(path,corrected);
        }
        catch (IOException ioe){
            ioe.printStackTrace();;
        }

    }

    private List<String> readFile(Path path){
        try{
            return Files.readAllLines(path);
        }
        catch (IOException ioe){
            throw new IllegalStateException();
        }
    }
}
