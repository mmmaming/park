package com.company;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

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
        System.out.println(key1);
        System.out.println(key2);
        System.out.println(key3);
        System.out.println(key4);
        System.out.println(key5);
        System.out.println(key6);
    }
}
