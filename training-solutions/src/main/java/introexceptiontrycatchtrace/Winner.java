package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {
    private List<String> names = new ArrayList<>();

    public void addName(String name){
        this.names.add(name);
    }

    public String getWinner(){
        Random rnd = new Random();
        int rindex=rnd.nextInt(names.size());
        return names.get(rindex).toUpperCase();
    }


}
