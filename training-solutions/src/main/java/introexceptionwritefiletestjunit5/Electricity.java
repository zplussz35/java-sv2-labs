package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {
    public List<String> getStreet(){
        List<String> streets = new ArrayList<>();
        streets.add(LocalDate.now().toString());
        streets.add("Aladár u.");
        streets.add("Kárpát u.");
        streets.add("Zátony u.");

        return streets;
    }
    public void writeStreets(Path path){
        try{
            Files.write(path,getStreet());
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

}
