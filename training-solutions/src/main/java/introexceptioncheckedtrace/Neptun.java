package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Neptun {
    public static void main(String[] args) {
        try{
            List<String> input = new Neptun().getFile("Neptun.csv");
            System.out.println(input);
        }
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }

    public List<String> getFile(String path) throws IOException{
        List<String> input = Files.readAllLines(Paths.get(path));
        return input;
    }
}
