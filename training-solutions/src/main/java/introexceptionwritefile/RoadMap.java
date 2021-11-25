package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RoadMap {
    public static void main(String[] args) {
        List<String> countries= new ArrayList<>();
        countries.add("Andornaktálya");
        countries.add("Tiszafüred");
        countries.add("Hortobágy");
        countries.add("Egyek");
        countries.add("Kónya");
        countries.add("Debrecen");
        try{
            Files.write(Paths.get("src/main/resources/roadmap.txt"),countries);
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }

    }
}
