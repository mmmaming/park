package com.company;
import java.util.Arrays;


public class ParkLot {
    public ParkLot(int size) {
        this.parkList = new Car[size];
        this.stallSize = size;
        this.numberOfVacancy = size;
        this.precentageOfVacancy = this.numberOfVacancy / size;
    }
    private int numberOfVacancy;
    private double precentageOfVacancy;
    private final int stallSize;

    public int getNumberOfVacancy() {
        return numberOfVacancy;
    }

    private final Car[] parkList;


    public int park(Car car) {
        int emptyIndex = getEmptyStall();
        parkList[emptyIndex] = car;
        this.numberOfVacancy--;
        this.precentageOfVacancy = (double)this.numberOfVacancy / this.stallSize;
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
        this.numberOfVacancy++;
        this.precentageOfVacancy = this.numberOfVacancy / this.stallSize;
        return car;
    }

    public double getPrecentageOfVacancy() {
        return precentageOfVacancy;
    }

    public Car[] getParkList() {
        return parkList;
    }
}
