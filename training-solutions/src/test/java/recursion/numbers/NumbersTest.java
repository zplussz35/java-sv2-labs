package recursion.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void getSum() {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        assertEquals(55,new Numbers().getSum(nums));
    }
}