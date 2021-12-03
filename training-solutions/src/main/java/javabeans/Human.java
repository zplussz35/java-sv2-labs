package javabeans;

public class Human {
    private String name;
    private double weight;
    private int iq;

    public Human(String name, double weight, int iq) {
        this.name = name;
        this.weight = weight;
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getIq() {
        return iq;
    }
}
