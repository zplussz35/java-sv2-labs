package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void testGetTrainerWithMaxAge() {
        List<Trainer> trainers= Arrays.asList(new Trainer("Zoltán",22),
                new Trainer("László",55),
                new Trainer("Gábor",33),
                new Trainer("Csenge",19),
                new Trainer("Márti",43),
                new Trainer("Márió",76));
        assertEquals("Márió",new MaxAgeCalculator().getTrainerWithMaxAge(trainers).getName());
        assertEquals(76,new MaxAgeCalculator().getTrainerWithMaxAge(trainers).getAge());
    }
}