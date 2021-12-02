package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    @Test
    void selectSalesPersonWithMaxSalesAmount() {
        List<Salesperson> sPeople= Arrays.asList(new Salesperson("Zoltán",100,200),
                new Salesperson("László",400,200),
                new Salesperson("Krisztina",155,200),
                new Salesperson("Máté",500,200));
        assertEquals("Máté",new Sales().selectSalesPersonWithMaxSalesAmount(sPeople).getName());
        assertEquals(500,new Sales().selectSalesPersonWithMaxSalesAmount(sPeople).getAmount());
        assertEquals(200,new Sales().selectSalesPersonWithMaxSalesAmount(sPeople).getTarget());
    }

    @Test
    void selectSalesPersonWithFurthestAboveTarget() {
        List<Salesperson> sPeople= Arrays.asList(new Salesperson("Zoltán",100,200),
                new Salesperson("László",400,200),
                new Salesperson("Krisztina",155,200),
                new Salesperson("Máté",500,200));
        assertEquals("Máté",new Sales().selectSalesPersonWithFurthestAboveTarget(sPeople).getName());
        assertEquals(500,new Sales().selectSalesPersonWithFurthestAboveTarget(sPeople).getAmount());
        assertEquals(200,new Sales().selectSalesPersonWithFurthestAboveTarget(sPeople).getTarget());
    }

    @Test
    void selectSalesPersonWithFurthestBelowTarget() {
        List<Salesperson> sPeople= Arrays.asList(new Salesperson("Zoltán",100,200),
                new Salesperson("László",400,200),
                new Salesperson("Krisztina",155,200),
                new Salesperson("Máté",500,200));
        assertEquals("Zoltán",new Sales().selectSalesPersonWithFurthestBelowTarget(sPeople).getName());
        assertEquals(100,new Sales().selectSalesPersonWithFurthestBelowTarget(sPeople).getAmount());
        assertEquals(200,new Sales().selectSalesPersonWithFurthestBelowTarget(sPeople).getTarget());
    }
}