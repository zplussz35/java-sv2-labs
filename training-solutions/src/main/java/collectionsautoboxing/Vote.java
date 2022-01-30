package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {
    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votes){
        Map<VoteResult,Integer> result=new HashMap<>();

        for (Map.Entry<String,VoteResult> actual:votes.entrySet()) {
            if(!result.containsKey(actual.getValue())){
                result.put(actual.getValue(),1);
            }else{
                result.put(actual.getValue(),result.get(actual.getValue())+1);
            }
        }
        return result;
    }
}
