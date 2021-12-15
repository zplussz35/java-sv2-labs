package interfaces.figure;

public class Circle implements Area{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return radius*radius*3.1415;
    }
}
