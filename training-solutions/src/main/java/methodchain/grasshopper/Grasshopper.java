package methodchain.grasshopper;

public class Grasshopper {
    private int position=0;
    public Grasshopper hopOnce(Direction direction){
        if(direction==Direction.POSITIVE){
            position++;
        }
        else{
            position--;
        }
        return this;
    }
    public void moveFromZeroToThreeWithFiveHops(){
        hopOnce(Direction.NEGATIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE);
    }

    public int getPosition() {
        return position;
    }
}
