package methodpass.troopers;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HeadQuarter {
    private List<Trooper> troops = new ArrayList<>();

    public List<Trooper> getTrooper(){
        return troops;
    }
    public void addTrooper(Trooper t){
        this.troops.add(t);
    }
    public void moveTrooperByName(String name,Position target){
        if(name==null||name.isEmpty()){
            throw new IllegalArgumentException("Dont correct name!");
        }
        if(target==null){
            throw new IllegalArgumentException("Position cannot be null!");
        }
        moveTrooper(findTrooperByName(name),target);
    }
    public void moveClosestTrooper(Position target){

        if(target==null){
            throw new IllegalArgumentException("Position cannot be null!");
        }
        moveTrooper(findClosestTrooper(target),target);
    }

    private Trooper findTrooperByName(String name){
        for (Trooper t:troops) {
            if(t.getName().equals(name)){
                return t;
            }
        }
        return null;
    }
    private Trooper findClosestTrooper(Position target){
        double minDist=Double.MAX_VALUE;
        Trooper minDistTrooper=null;

        for (Trooper t: troops) {
            if(t.distanceFrom(target)<minDist){
                minDist=t.distanceFrom(target);
                minDistTrooper=t;
            }
        }
        return minDistTrooper;
    }
    private void moveTrooper(Trooper trooper, Position target){
        trooper.changePosition(target);
    }
}


