package abstractclass.gamecharacter;

public class Point {
    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long getDistance(Point otherPoint){
        return (long) Math.sqrt((otherPoint.getX()-this.x)*(otherPoint.getX()-this.x)+(otherPoint.getY()-this.y)*(otherPoint.getY()-this.y));

    }
}
