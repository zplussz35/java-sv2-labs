package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients= new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Path path){
        List<String> lines=getFile(path);
        String[] words= new String[3];
        for(int i = 2;i<lines.size();i++) {
            words=lines.get(i).split(" ");
            ingredients.add(words[2]);
        }
    }

    private List<String> getFile(Path path){
        try{
            return Files.readAllLines(path);
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file",ioe);
        }
    }
}
