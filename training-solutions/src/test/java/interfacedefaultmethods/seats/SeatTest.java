package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {
    @Test
    void testFamilyCar(){
        FamilyCar f = new FamilyCar();
        assertEquals(5,f.getNumberOfSeats());
    }
    @Test
    void testSportsCar(){
        SportsCar sportsCar = new SportsCar();
        assertEquals(2,sportsCar.getNumberOfSeats());
    }
    @Test
    void testCar(){
        Car car = new Car("Opel",4);
        assertEquals(4,car.getNumberOfSeats());
    }

}