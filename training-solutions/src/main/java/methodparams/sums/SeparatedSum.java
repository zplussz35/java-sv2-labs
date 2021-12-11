package methodparams.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SeparatedSum {


    public String readFromFile(Path path){
        try{
            String result;
            result= Files.readAllLines(path).get(0);
            return result;
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file!",ioe);
        }

    }

    public Sums sum(String floatingNumbers){

        String[] data = floatingNumbers.split(";");
        double correctedData=0;
        List<Integer> indexesToReplace = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if(data[i].contains(",")){
                indexesToReplace.add(i);
            }
        }
        for (int i = 0; i < data.length; i++) {
            if(indexesToReplace.contains(i)){
                data[i]=data[i].replace(",",".");
            }
        }
        double positiveSum=0;
        double negativeSum=0;
        for (int i=0;i < data.length;i++) {
            correctedData=Double.parseDouble(data[i]);
            if(correctedData>=0){
                positiveSum+=correctedData;
            }
            else{
                negativeSum+=correctedData;
            }
        }
        return new Sums(positiveSum,negativeSum);

    }
}
