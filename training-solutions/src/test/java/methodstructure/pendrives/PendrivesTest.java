package methodstructure.pendrives;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PendrivesTest {

    @Test
    void testGetBest() {
        List<Pendrive> pens=Arrays.asList(new Pendrive("p1",100,200),
                new Pendrive("p2",300,300),
                new Pendrive("p3",200,500),
                new Pendrive("p4",500,2000),
                new Pendrive("p5",1000,10000),
                new Pendrive("p6",1100,20000)
                );

        assertEquals("p2",new Pendrives().getBest(pens).getName());
        assertEquals(300,new Pendrives().getBest(pens).getCapacity());
        assertEquals(300,new Pendrives().getBest(pens).getPrice());
    }

    @Test
    void getCheapest() {
        List<Pendrive> pens=Arrays.asList(new Pendrive("p1",100,200),
                new Pendrive("p2",300,300),
                new Pendrive("p3",200,500),
                new Pendrive("p4",500,2000),
                new Pendrive("p5",1000,10000),
                new Pendrive("p6",1100,20000)
        );

        assertEquals("p1",new Pendrives().getCheapest(pens).getName());
        assertEquals(100,new Pendrives().getCheapest(pens).getCapacity());
        assertEquals(200,new Pendrives().getCheapest(pens).getPrice());

    }

    @Test
    void risePriceWhereCapacity() {
        List<Pendrive> pens=Arrays.asList(new Pendrive("p1",100,200),
                new Pendrive("p2",300,300),
                new Pendrive("p3",200,500),
                new Pendrive("p4",500,2000),
                new Pendrive("p5",1000,10000),
                new Pendrive("p6",1100,20000)
        );
        new Pendrives().risePriceWhereCapacity(pens,10,500);
        assertEquals(2200,pens.get(3).getPrice());
    }
}