package collectionsiterator;

import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {
    private List<ChristmasPresent> presents;

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    public void addNewPresent(ChristmasPresent present){
        presents.add(present);
    }

    public List<ChristmasPresent> getPresents() {
        return presents;
    }

    public void removeTooExpensivePresent(int maxPrice){
        Iterator<ChristmasPresent> i=presents.iterator();
        while(i.hasNext()){
            ChristmasPresent present=i.next();
            if(present.getPrice()>maxPrice){
                i.remove();
            }
        }
    }
}
