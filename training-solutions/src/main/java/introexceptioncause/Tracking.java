package introexceptioncause;

import javax.sound.midi.Track;
import java.util.List;

public class Tracking {
    public static void main(String[] args) {
        try{
            List<String>  lines= new TrackPoints().readFile("tracking.csv");
            System.out.println("Magasságváltozások a túra során: "+new TrackPoints().getHeightDifferences(lines));
        }
        catch(IllegalArgumentException ise){
            System.out.println(ise.getMessage());
        }
    }
}
