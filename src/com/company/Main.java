package com.company;


public class Main {
    public static void main(String[] args) {
        ParkLot parkLot = new ParkLot();
        Car car1 = new Car();
        Car car2 = new Car();


        parkLot.park(car1);
        parkLot.park(car2);
//        parkLot.getCar(car1);
    }
}
