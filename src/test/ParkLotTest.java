package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.company.Car;
import com.company.ParkLot;
import com.company.ParkingBoy;
import com.company.Strategy;
import org.junit.Test;

public class ParkLotTest {

    @Test
    public void should_park() {
        ParkLot parkLot = new ParkLot(100);
        Car car1 = new Car();
        parkLot.park(car1);
        assertEquals(parkLot.getParkList()[0], car1);
    }

    @Test
    public void should_get_an_empty_stall_when_car_go_away() {
        ParkLot parkLot = new ParkLot(100);
        Car car1 = new Car();
        int car1Index = parkLot.park(car1);
        parkLot.getCar(car1Index);
        assertNull(parkLot.getParkList()[0]);
    }

    @Test
    public void should_park_by_sequence() {
        ParkLot parkLot = new ParkLot(100);
        Car car1 = new Car();
        Car car2 = new Car();

        parkLot.park(car1);
        parkLot.park(car2);
        assertEquals(parkLot.getParkList()[0], car1);
        assertEquals(parkLot.getParkList()[1], car2);
    }

    @Test
    public void should_park_at_first_null_stall() {
        ParkLot parkLot = new ParkLot(100);
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        int car1Index = parkLot.park(car1);
        parkLot.park(car2);
        parkLot.getCar(car1Index);
        parkLot.park(car3);
        assertEquals(parkLot.getParkList()[0], car3);
    }

    @Test
    public void should_park_car_by_parking_boy() {
        ParkLot parkLot1 = new ParkLot(100);

        ParkingBoy parkingBoy = new ParkingBoy(parkLot1);
        Car car1 = new Car();

        String car1Key = parkingBoy.park(car1);
        Car car1Copy = parkingBoy.getCar(car1Key);
        assertEquals(car1, car1Copy);
    }

    @Test
    public void should_get_correct_car_from_mutiple_park_lots() {
        ParkLot parkLot1 = new ParkLot(100);
        ParkLot parkLot2 = new ParkLot(100);
        ParkLot parkLot3 = new ParkLot(100);
        ParkLot parkLot4 = new ParkLot(100);

        ParkingBoy parkingBoy = new ParkingBoy(parkLot1, parkLot2, parkLot3);
        parkingBoy.registerParkLot(parkLot4);
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();

        String car1Key = parkingBoy.park(car1);
        String car2Key = parkingBoy.park(car2);
        String car3Key = parkingBoy.park(car3);
        String car4Key = parkingBoy.park(car4);
        String car5Key = parkingBoy.park(car5);
        String car6Key = parkingBoy.park(car6);

        Car car1Copy = parkingBoy.getCar(car1Key);
        Car car2Copy = parkingBoy.getCar(car2Key);
        Car car3Copy = parkingBoy.getCar(car3Key);
        Car car4Copy = parkingBoy.getCar(car4Key);
        Car car5Copy = parkingBoy.getCar(car5Key);
        Car car6Copy = parkingBoy.getCar(car6Key);

        assertEquals(car1, car1Copy);
        assertEquals(car2, car2Copy);
        assertEquals(car3, car3Copy);
        assertEquals(car4, car4Copy);
        assertEquals(car5, car5Copy);
        assertEquals(car6, car6Copy);
    }

    @Test
    public void should_park_by_number_strategy() {
        ParkLot parkLot = new ParkLot(20);
        ParkLot parkLot1 = new ParkLot(20);
        ParkingBoy pb = new ParkingBoy(parkLot, parkLot1);
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();
        String key1 = pb.park(car1, Strategy.NUMBER);
        String key2 = pb.park(car2, Strategy.NUMBER);
        String key3 = pb.park(car3, Strategy.NUMBER);
        String key4 = pb.park(car4, Strategy.NUMBER);
        String key5 = pb.park(car5, Strategy.NUMBER);
        String key6 = pb.park(car6, Strategy.NUMBER);
        System.out.println("Number of vacangy");
        System.out.println(key1);
        System.out.println(key2);
        System.out.println(key3);
        System.out.println(key4);
        System.out.println(key5);
        System.out.println(key6);
    }

    @Test
    public void should_park_by_percentage_strategy() {
        ParkLot parkLot = new ParkLot(30);
        ParkLot parkLot1 = new ParkLot(20);
        ParkingBoy pb = new ParkingBoy(parkLot, parkLot1);
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();
        String key1 = pb.park(car1, Strategy.PERCENTAGE);
        String key2 = pb.park(car2, Strategy.PERCENTAGE);
        String key3 = pb.park(car3, Strategy.PERCENTAGE);
        String key4 = pb.park(car4, Strategy.PERCENTAGE);
        String key5 = pb.park(car5, Strategy.PERCENTAGE);
        String key6 = pb.park(car6, Strategy.PERCENTAGE);
        System.out.println("precentage of vacangy");
        System.out.println(key1);
        System.out.println(key2);
        System.out.println(key3);
        System.out.println(key4);
        System.out.println(key5);
        System.out.println(key6);
    }
}   