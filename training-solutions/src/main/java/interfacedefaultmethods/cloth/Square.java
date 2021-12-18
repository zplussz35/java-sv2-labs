package interfacedefaultmethods.cloth;

public interface Square {
    default int getNumberOfSides(){
        return 4;
    }
    default double getLengthOfDiagonal(){
        double a = getSide();
        return Math.sqrt(2*a*a);
    }
    default double getPerimeter(){
        return 4*getSide();
    }
    default double getArea(){
        double a=getSide();
        return a*a;
    }
    double getSide();
}
