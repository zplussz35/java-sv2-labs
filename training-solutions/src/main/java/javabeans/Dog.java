package javabeans;

public class Dog {
    private String name;
    private int age;
    private boolean pedigree;
    private double weight;

    public Dog(String name, int age, boolean pedigree, double weight) {
        this.name = name;
        this.age = age;
        this.pedigree = pedigree;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public double getWeight() {
        return weight;
    }
}
