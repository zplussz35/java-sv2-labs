package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {
    public List<String> getFullNames(String lastName, Path path){
        try(Scanner sc = new Scanner(path)){
            List<String> result= new ArrayList<>();
            while (sc.hasNextLine()){
                String firstName=sc.nextLine();
                result.add(lastName+ " "+ firstName);
            }
            return result;
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file",ioe);
        }
    }
}
