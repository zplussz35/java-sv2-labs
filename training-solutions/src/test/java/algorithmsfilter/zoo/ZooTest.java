package algorithmsfilter.zoo;

import algorithmsfilter.animal.Animal;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void getAnimalsWithNumberOfLegsGiven() {
        List<Animal> animals = Arrays.asList(new Animal("dog",4),
                new Animal("lion",4),
                new Animal("kenguru",2),
                new Animal("shark",0),
                new Animal("whale",0),
                new Animal("chimpanze",4));
        assertEquals(3,new Zoo(animals).getAnimalsWithNumberOfLegsGiven(4).size());
        assertEquals(2,new Zoo(animals).getAnimalsWithNumberOfLegsGiven(0).size());
    }
}