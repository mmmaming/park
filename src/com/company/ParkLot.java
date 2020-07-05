package com.company;
import java.util.Arrays;

public class ParkLot {

    Car[] parkList = new Car[10000];
    public void park(Car car) {
        int emptyIndex = getEmptyStall();
        parkList[emptyIndex] = car;
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
    
    public void getCar(Car car) {
//        int index = Arrays.binarySearch(parkList, car);
//        System.out.println(Arrays.asList(parkList).contains(car));
        int index = Arrays.asList(parkList).indexOf(car);
        parkList[index] = null;
        System.out.println(car.getDriver() + "的车开走了");
    }
}
