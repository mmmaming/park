package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ParkLot {
    private final Car[] parkList = new Car[10000];

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
    
    public Car getCar(int index) {
        Car car = Arrays.asList(parkList).get(index);
        parkList[index] = null;
        System.out.println(car + "go away");
        return car;
    }

    public Car[] getParkList() {
        return parkList;
    }
}
