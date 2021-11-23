package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PaulStreetBoys {
    public static void main(String[] args) {
        try {
            List<String> names = new PaulStreetBoys().readNames("palutcaifiuk.txt");
            new PaulStreetBoys().myPrint(names);
        }
        catch (IllegalStateException ise) {

            ise.getCause().printStackTrace();
        }
    }

    public void myPrint(List<String> input) {
        System.out.println(input);
    }

    public  List<String> readNames(String path) {
        try{
            List<String> names = new ArrayList<>();
            List<String> lines = Files.readAllLines(Paths.get(path));
            for(String s:lines){
                if("Nemecsek Ernő".equals(s)){
                    names.add(s.toLowerCase());
                }
                else{
                    names.add(s);
                }

            }
            return names;
        }
        catch(IOException ioe){
            throw new IllegalStateException("Cannot read file!",ioe);
        }
    }
}
