package collectionsmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {
    private Map<String, Integer> trips = new HashMap<>();

    public Map<String, Integer> getTrips() {
        return trips;
    }

    public void loadInPayments(Path path){
        try{
            List<String> lines = Files.readAllLines(path);
            for (String l:lines) {
                String[] parts=l.split(": ");
                String tripName=parts[0];
                int payment=Integer.parseInt(parts[1]);
                if(!trips.containsKey(tripName)){
                    trips.put(tripName,payment);
                } else{
                    trips.put(tripName,trips.get(tripName)+payment);
                }
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Cannot reach file!",ioe);
        }

    }
}
