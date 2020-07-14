package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ParkingPerson {

    private final ArrayList<ParkLot> parkLotList = new ArrayList<ParkLot>();

    public ParkingPerson(ParkLot... parkLots) {
        this.parkLotList.addAll(Arrays.asList(parkLots));
    }


    public void registerParkLot(ParkLot parkLot) {
        this.parkLotList.add(parkLot);
    }

    public String park(Car car) {
        int length = this.parkLotList.size();
        int parkLotIndex = (int)Math.floor(Math.random() * length);
        int carIndex = parkLotList.get(parkLotIndex).park(car);
        return parkLotIndex + "-" + carIndex;
    }

    public Car getCar(String key) {
        int parkLotIndex = Integer.parseInt(key.split("-")[0]);
        int carIndex = Integer.parseInt(key.split("-")[1]);
        ParkLot parkLot = this.parkLotList.get(parkLotIndex);
        return parkLot.getParkList()[carIndex];
    }

    public ArrayList<ParkLot> getParkLotList() {
        return parkLotList;
    }
}
