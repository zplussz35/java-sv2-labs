package finalmodifier;

import static finalmodifier.CircleCalculator.PI;

public class CylinderCalculatorBasedOnCircle {
    CircleCalculator c = new CircleCalculator();
    public double calculateVolume(double r,double h){
        return c.calculateArea(r)*h;
    }
    public double calculateSurfaceArea(double r,double h){
        return c.calculatePerimeter(r)*h;
    }
}
