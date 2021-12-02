package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    @Test
    void containsBalanceGreaterThan() {
        List<BankAccount> baList = Arrays.asList(new BankAccount("Zoltán","123",100),
                new BankAccount("Sára","123",200),
                new BankAccount("Bálint","123",300),
                new BankAccount("Márta","123",400),
                new BankAccount("László","123",500));
        assertTrue(new BankAccountDecisionMaker().containsBalanceGreaterThan(baList,100));
        assertFalse(new BankAccountDecisionMaker().containsBalanceGreaterThan(baList,500));
    }
}