package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> populates, int min){
        for (Integer n:populates) {
            if(n<min){
                return true;
            }
        }
        return false;
    }

}
