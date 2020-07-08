package com.company;
import java.util.Arrays;

public class ParkLot {
    private Car[] parkList = new Car[10000];
    public int park(Car car) {
        int emptyIndex = getEmptyStall();
        parkList[emptyIndex] = car;

        return emptyIndex;
    }

    private int getEmptyStall() {
        int index = 0;
        for (int i = 0; i < parkList.length; i++) {
            if (parkList[i] == null) {
                index = i;
                break;
            }
        }
        return index;
    }
    
    public void getCar(int index) {
        Car car = Arrays.asList(parkList).get(index);
        parkList[index] = null;
        System.out.println(car + "go away");
    }

    public Car[] getParkList() {
        return parkList;
    }
}
