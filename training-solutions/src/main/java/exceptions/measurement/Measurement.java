package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {
    public List<String> readFromFile(Path path){
        try{
            return Files.readAllLines(path);
        }catch (IOException ioe){
            throw new IllegalStateException("Can not read file.",ioe);
        }

    }
    public List<String> validate(List<String> lines){
        List<String> result= new ArrayList<>();
        for (String line:lines) {
            String[] data=line.split(",");
            if(data.length!=3){
                result.add(line);
                continue;
            }
            if(containsAlpha(data[0])|| containsAlpha(data[1])){
                result.add(line);
            }
            if(!validName(data[2])){
                result.add(line);
            }
        }
        return result;
    }

    private boolean containsAlpha(String pString){
        for (char c:pString.toCharArray()) {
            if(Character.isAlphabetic(c)){
                return true;
            }
        }
        return false;
    }

    private boolean validName(String pString){
        String[] data=pString.strip().split(" ");
        return data.length > 1;
    }
}
