package com.company;
import java.util.Arrays;

public class ParkLot {
    // TODO
    修改停车方式，可以返回个类似token，方便取车用。
    private Car[] parkList = new Car[10000];
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
        int index = Arrays.asList(parkList).indexOf(car);
        parkList[index] = null;
    }

    public void setParkList(Car[] parkList) {
        this.parkList = parkList;
    }

    public Car[] getParkList() {
        return parkList;
    }
}
