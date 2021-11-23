package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {
    public static void main(String[] args) {
        try{
            List<String> input = Files.readAllLines(Paths.get("poem.txt"));
            for(String s: input){
                System.out.print(s.charAt(0));
            }
        }
        catch(IOException ioe){
            System.out.println(ioe.getStackTrace());
        }
    }
}
