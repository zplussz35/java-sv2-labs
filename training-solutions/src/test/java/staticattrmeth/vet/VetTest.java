package staticattrmeth.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test
    void addDog() {
        Vet vet = new Vet();
        vet.addDog(new Dog("Buksi",4,Species.BEAGLE));
        vet.addDog(new Dog("Suzy",2,Species.BEAGLE));
        vet.addDog(new Dog("Rex",1,Species.BEAGLE));
        assertEquals(4,Vet.code);
        assertEquals(2,vet.getDogs().get(1).getCode());
    }
}