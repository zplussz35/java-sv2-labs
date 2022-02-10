package lambda;

import java.util.ArrayList;
import java.util.List;

public class TreeNursery {
    private List<Sapling> saplings=new ArrayList<>();

    public void prune(int maxHeight){
        saplings.forEach(s->s.cut(maxHeight));
    }

    public void sell(String species, int minHeight){
        saplings.removeIf(s->s.getSpecies().equals(species)&&s.getHeight()>minHeight);
    }

}
