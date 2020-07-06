package test;
import static org.junit.Assert.assertEquals;

import com.company.Car;
import com.company.ParkLot;
import org.junit.Test;

public class ParkLotTest {
    @Test
    public void evaluatesExpression() {
        ParkLot parkLot = new ParkLot();
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setDriver("Tom");
        car2.setDriver("Jack");

        String car1Driver = car1.getDriver();
        String car2Driver = car2.getDriver();

        parkLot.park(car1);
        parkLot.park(car2);
        parkLot.getCar(car1);
        assertEquals(car1Driver, "Tom");
        assertEquals(car2Driver, "Jack");
    }

    @Test
    public void testPark() {
        ParkLot parkLot = new ParkLot();
        Car car1 = new Car();
        parkLot.park(car1);
        assertEquals(parkLot.parkList[0], car1);
    }

    @Test
    public void testFirstStallParkisEmptyWhenCarGoAway() {
        ParkLot parkLot = new ParkLot();
        Car car1 = new Car();
        parkLot.park(car1);
        parkLot.getCar(car1);
        assertEquals(parkLot.parkList[0], null);
    }

    @Test
    public void testParkBySequence() {
        ParkLot parkLot = new ParkLot();
        Car car1 = new Car();
        Car car2 = new Car();

        parkLot.park(car1);
        parkLot.park(car2);
        assertEquals(parkLot.parkList[0], car1);
        assertEquals(parkLot.parkList[1], car2);
    }

    @Test
    public void testParkAtFirstNullStall() {
        ParkLot parkLot = new ParkLot();
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        parkLot.park(car1);
        parkLot.park(car2);
        parkLot.getCar(car1);
        parkLot.park(car3);
        assertEquals(parkLot.parkList[0], car3);

    }


}