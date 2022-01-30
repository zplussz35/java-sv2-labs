package collectionslist.bunchofflowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BunchOfFlowersTest {

    @Test
    void testAddFlowerInTheMiddle(){
       BunchOfFlowers bunchOfFlowers= new BunchOfFlowers();

       bunchOfFlowers.addFlowerInTheMiddle("tulipán");
       bunchOfFlowers.addFlowerInTheMiddle("körömvirág");
       bunchOfFlowers.addFlowerInTheMiddle("barackvirág");
       bunchOfFlowers.addFlowerInTheMiddle("rózsa");
       bunchOfFlowers.addFlowerInTheMiddle("pitypang");

       assertEquals(9,bunchOfFlowers.getFlowers().size());
       assertEquals("tulipán",bunchOfFlowers.getFlowers().get(4));

    }

}