package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character{
    private int numberOfArrows;

    public Archer(Point position, Random random) {
        super(position, random);
        this.numberOfArrows=100;
    }

    public int getNumberOfArrow() {
        return numberOfArrows;
    }
    private int getActualSecondaryDamage(){
        return super.getRandom().nextInt(5)+1;
    }

    private void shootingAnArrow(Character enemy){
        numberOfArrows--;
        super.hit(enemy,getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        this.shootingAnArrow(enemy);
    }


}
