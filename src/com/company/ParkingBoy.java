package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class ParkingBoy extends ParkingPerson {
    // TODO 子类实现父类构造函数方式
    public ParkingBoy(ParkLot... parkLots) {
        super(parkLots);
    }

    public String park(Car car, Strategy parkStrategy) {
        // TODO 调用父类中的实例变量的方式是否正确
        int maxNumberOfVacancy = super.getParkLotList().get(0).getNumberOfVacancy();
        double maxNumberOfPrecentage = super.getParkLotList().get(0).getPrecentageOfVacancy();;
        int maxNumberOfVacancyParkLotIndex = 0;
        int maxNumberOfPrecentageParkLotIndex = 0;
        // TODO 怎么查找数组中的最大最小值
        for(int i = 0; i < super.getParkLotList().size(); i++) {
            ParkLot currentParkLot = super.getParkLotList().get(i);
            if (currentParkLot.getNumberOfVacancy() > maxNumberOfVacancy) {
                maxNumberOfVacancy = currentParkLot.getNumberOfVacancy();
                maxNumberOfVacancyParkLotIndex = i;
            }
            if (currentParkLot.getPrecentageOfVacancy() > maxNumberOfPrecentage) {
                maxNumberOfPrecentage = currentParkLot.getPrecentageOfVacancy();
                maxNumberOfPrecentageParkLotIndex = i;
            }
        }
        if (parkStrategy == Strategy.NUMBER) {
            int parkLotIndex = maxNumberOfVacancyParkLotIndex;
            int carIndex = super.getParkLotList().get(parkLotIndex).park(car);
            return parkLotIndex + "-" + carIndex;
        } else {
            int parkLotIndex = maxNumberOfPrecentageParkLotIndex;
            int carIndex = super.getParkLotList().get(parkLotIndex).park(car);
            return parkLotIndex + "-" + carIndex;

        }
    }

}

