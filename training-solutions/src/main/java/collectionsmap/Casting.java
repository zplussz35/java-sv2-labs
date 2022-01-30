package collectionsmap;

import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants){
        for (Map.Entry<Integer,String> actual:applicants.entrySet()) {
            if(actual.getKey()>lastNumber){
                return actual.getValue();
            }
        }
        return applicants.values().stream().toList().get(0);
    }
}
