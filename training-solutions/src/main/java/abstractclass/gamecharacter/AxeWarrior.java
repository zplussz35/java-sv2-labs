package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character{
    public static final int SECONDARY_DAMAGE_MULTIPLIER=2;

    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if(this.getPosition().getDistance(enemy.getPosition())<2){
            super.hit(enemy,getActualSecondaryDamage());
        }
    }

    private int getActualSecondaryDamage(){
        return (int)(Math.random() * SECONDARY_DAMAGE_MULTIPLIER * getActualPrimaryDamage());
    }
}
