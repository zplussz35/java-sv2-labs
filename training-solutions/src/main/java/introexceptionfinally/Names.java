package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        try{
            List<String> lines =Files.readAllLines(Paths.get("src/main/resources/names.txt"));
            boolean found= false;
            for (String s:lines) {
                if(s.startsWith("dr.")){
                    System.out.println(s);
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println("");
            }


        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
        finally {
            System.out.println("End of reading.");
        }
    }
}
