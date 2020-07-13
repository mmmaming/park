package com.company;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ParkLot parkLot = new ParkLot();
        ParkLot parkLot1 = new ParkLot();
        ParkingBoy pb = new ParkingBoy(parkLot, parkLot1);
        Car car1 = new Car();
        Car car2 = new Car();
        String key1 = pb.park(car1);
        String key2 = pb.park(car2);
        Car car3 = pb.getCar(key1);
        System.out.println(car3.equals(car1));
    }
}
