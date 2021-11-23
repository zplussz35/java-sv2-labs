package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {

 public List<String> readFile(String path){
     try{
        return Files.readAllLines(Paths.get(path));

     }
     catch (IOException ioe)
     {
         throw new IllegalStateException("Cannot read file!",ioe);
     }

 }

 public List<Integer> getHeightDifferences(List<String> input){
     List<Integer> heightList = new ArrayList<>();
     List<Integer> differences = new ArrayList<>();

     for (String s: input) {
         List<String> line= List.of(s.split(";"));
         int height=Integer.parseInt(line.get(2));
         heightList.add(height);
     }
     for (int i = 1; i < heightList.size(); i++) {
         int difference = heightList.get(i)-heightList.get(i-1);
         differences.add(difference);
     }
     return differences;
 }

}
