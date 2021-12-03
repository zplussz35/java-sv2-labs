package methodstructure.bmi;

public class BodyMass {
    private double height;
    private double weight;

    public BodyMass(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getBodyMassIndex(){
        return getWeight()/getHeight()*getHeight();
    }

    public BmiCategory getBody(){
        if(getBodyMassIndex()<18.5){
            return BmiCategory.UNDERWEIGHT;
        }
        else if(getBodyMassIndex()>25){
            return BmiCategory.OVERWEIGHT;
        }
        else{
            return BmiCategory.NORMAL;
        }
    }
    public boolean isThinnerThan(BodyMass other){
        return this.getBodyMassIndex()<other.getBodyMassIndex();
    }
}
