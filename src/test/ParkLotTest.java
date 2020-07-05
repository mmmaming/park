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
}

//javac -cp .:/Users/maming/code/park/lib/junit-4.13.jar:/Users/maming/code/park/lib/hamcrest-core-1.3.jar ParkLotTest.java

//java -cp .:/Users/maming/code/park/lib/junit-4.13.jar:/Users/maming/code/park/lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore ParkLotTest.java