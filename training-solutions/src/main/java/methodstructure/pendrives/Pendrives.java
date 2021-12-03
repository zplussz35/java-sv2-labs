package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public  Pendrive getBest(List<Pendrive> pendrives){
        Pendrive best;
        if(!pendrives.isEmpty()){
            best=pendrives.get(0);
        }
        else{
            return null;
        }
        for (int i=1;i< pendrives.size();i++) {
            if(pendrives.get(i).comparePricePerCapacity(best)<0){
                best= pendrives.get(i);
            }
        }
        return best;
    }

    public Pendrive getCheapest(List<Pendrive> pens){
        Pendrive cheapest;
        if(!pens.isEmpty()){
            cheapest=pens.get(0);
        }
        else{
            return null;
        }
        for (int i = 1; i < pens.size(); i++) {
            if(pens.get(i).isCheaperThan(cheapest)){
                cheapest=pens.get(i);
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pens, int percent, int capacity){
        for (Pendrive p:pens) {
            if(p.getCapacity()==capacity){
                p.risePrice(percent);
            }
        }
    }

}
