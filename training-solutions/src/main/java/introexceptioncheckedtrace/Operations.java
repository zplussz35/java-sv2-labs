package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public static void main(String[] args) {
        try{
            List<String> input= new Operations().readFile("underground.txt");
            System.out.println(new Operations().getDailySchedule(input));
        }
        catch(IOException ioe){
            System.out.println(ioe.getStackTrace());
        }
    }
    public List<String> readFile(String path) throws IOException {
        List<String> input = Files.readAllLines(Paths.get(path));
        return input;
    }


    public String getDailySchedule(List<String> input){
        StringBuilder sb = new StringBuilder(LocalDate.now().toString()+", ");
        for (String s:input){
            if(s.startsWith("2")){
                sb.append(s).append(" ");
            }

        }
        return sb.toString();
    }
}

