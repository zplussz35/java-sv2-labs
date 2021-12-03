package methodpass.troopers;

public class Position {
    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double distanceFrom(Position pos){
        return Math.sqrt((this.posX-pos.posX)*(this.posX-pos.posX) + (this.posY-pos.posY)*(this.posY-pos.posY));

    }
}
