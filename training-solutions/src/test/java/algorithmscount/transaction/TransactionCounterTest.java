package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {

    @Test
    void testCounterLessThan(){
        List<Transaction> trans= Arrays.asList(new Transaction("123",TransactionType.CREDIT,120),
                new Transaction("123",TransactionType.CREDIT,220),
                new Transaction("123",TransactionType.DEBIT,320),
                new Transaction("123",TransactionType.DEBIT,420),
                new Transaction("123",TransactionType.CREDIT,520));

        assertEquals(2,new TransactionCounter().counterLessThan(trans,400));
        assertEquals(2,new TransactionCounter().counterLessThan(trans,500));
        assertEquals(3,new TransactionCounter().counterLessThan(trans,600));
        assertEquals(0,new TransactionCounter().counterLessThan(trans,100));
    }

}