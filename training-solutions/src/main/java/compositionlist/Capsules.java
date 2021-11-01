package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> capsList= new ArrayList<>();

    public void addLast(String color){
        capsList.add(color);

    }
    public void addFirst(String color ){
        capsList.add(0,color);
    }
    public String removeFirst(){
        return capsList.remove(0);
    }
    public String removeLast(){
        return capsList.remove(capsList.size()-1);
    }
    public List<String> getColors(){
        return capsList;
    }

}
