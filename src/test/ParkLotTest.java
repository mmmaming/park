package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.company.Car;
import com.company.ParkLot;
import org.junit.Test;

public class ParkLotTest {

    @Test
    public void should_park() {
        ParkLot parkLot = new ParkLot();
        Car car1 = new Car();
        parkLot.park(car1);
        assertEquals(parkLot.getParkList()[0], car1);
    }

    @Test
    public void should_get_an_empty_stall_when_car_go_away() {
        ParkLot parkLot = new ParkLot();
        Car car1 = new Car();
        int car1Index = parkLot.park(car1);
        parkLot.getCar(car1Index);
        assertNull(parkLot.getParkList()[0]);
    }

    @Test
    public void should_park_by_sequence() {
        ParkLot parkLot = new ParkLot();
        Car car1 = new Car();
        Car car2 = new Car();

        parkLot.park(car1);
        parkLot.park(car2);
        assertEquals(parkLot.getParkList()[0], car1);
        assertEquals(parkLot.getParkList()[1], car2);
    }

    @Test
    public void should_park_at_first_null_stall() {
        ParkLot parkLot = new ParkLot();
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        int car1Index = parkLot.park(car1);
        parkLot.park(car2);
        parkLot.getCar(car1Index);
        parkLot.park(car3);
        assertEquals(parkLot.getParkList()[0], car3);

    }


}