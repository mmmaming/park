package com.company;
import java.util.Arrays;


public class ParkLot {
    public ParkLot(int size) {
        // TODO java中有没有类似JS中对象的东西，可以记录每个停车场的空位数和空位率
        //  { parkLot1: {num: 20, precentage: 22%}, parkLot2: {num: 10, precentage: 97%} }
        this.parkList = new Car[size];
        this.stallSize = size;
        // TODO 如何查找数组中null值的数量
        this.numberOfVacancy = size;
        // TODO 是否可以通过改变numberOfVacancy的值自动计算precentageOfVacancy;
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
