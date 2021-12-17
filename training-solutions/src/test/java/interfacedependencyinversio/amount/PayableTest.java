package interfacedependencyinversio.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {
    @Test
    void testAmount(){
        Amount am = new Amount();
        assertEquals(12345,am.getPayableAmount(12345));
    }
    @Test
    void testCash(){
        Cash cash = new Cash();
        assertEquals(12345,cash.getPayableAmount(12345));
        assertEquals(12345,cash.getPayableAmount(12344));
        assertEquals(12345,cash.getPayableAmount(12343));
        assertEquals(12340,cash.getPayableAmount(12342));
        assertEquals(12350,cash.getPayableAmount(12348));
    }
    @Test
    void testBankAtm(){
        BankAtm bankAtm = new BankAtm();
        assertEquals(13000,bankAtm.getPayableAmount(12345));
        assertEquals(13000,bankAtm.getPayableAmount(13000));
        assertEquals(14000,bankAtm.getPayableAmount(13001));
    }



}