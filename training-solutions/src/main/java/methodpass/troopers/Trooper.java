package methodpass.troopers;

public class Trooper {
    private final String name;
    private Position pos;

    public Trooper(String name) {
        if(name.equals("")||name==null){
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
        pos = new Position(0,0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition(){
        return pos;
    }
    public void changePosition(Position target){
        if(target==null){
            throw new IllegalArgumentException("The new position must not be null");
        }
        this.pos=target;
    }

    public double distanceFrom(Position target){
        return this.pos.distanceFrom(target);
    }
}
