package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {


    @Test
    void testCountWithBalanceGreaterThan() {
        List<BankAccount> bankAccounts = Arrays.asList(
                new BankAccount("Zoltán", "123", 100),
                new BankAccount("László", "123", 200),
                new BankAccount("Sára", "123", 300),
                new BankAccount("Márti", "123", 400));

        assertEquals(3, new BankAccountConditionCounter().countWithBalanceGreaterThan(bankAccounts, 100));
        assertEquals(0, new BankAccountConditionCounter().countWithBalanceGreaterThan(bankAccounts, 400));
    }

}