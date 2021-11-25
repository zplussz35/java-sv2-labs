package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    public List<String> getStreets(){
        List<String> blackouts=new ArrayList<>();
        blackouts.add(LocalDate.now().toString());
        blackouts.add("Aladár u.");
        blackouts.add("Kárpát u.");
        blackouts.add("Bajcsy-Zsilinszky u.");
        blackouts.add("Zsolnai u.");
        blackouts.add("Ó u.");
        blackouts.add("Apostol u.");

        return blackouts;
    }

    public  void writeStreets(Path path){
        try{
            Files.write(path,getStreets());
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }

    }

}
