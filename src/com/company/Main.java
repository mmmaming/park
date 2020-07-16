package com.company;
import java.io.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParkLot parkLot = new ParkLot(22);
        ParkLot parkLot1 = new ParkLot(20);
        ArrayList<String> arr = new ArrayList<String>();
        CleverParkingBoy cleverParkingBoy = new CleverParkingBoy(parkLot, parkLot1);
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Collections.sort(arr);
        System.out.println(cleverParkingBoy.getParkLotList().get(0));
        System.out.println(cleverParkingBoy.getParkLotList().get(1));
    }
}
