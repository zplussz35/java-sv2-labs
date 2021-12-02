package algorithmsfilter.zoo;

import algorithmsfilter.animal.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals=animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }
    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs){
        List<Animal> result = new ArrayList<>();
        for (Animal an:this.animals) {
            if(an.getNumberOfLegs()==numberOfLegs){
                result.add(an);
            }
        }
        return result;
    }
}
