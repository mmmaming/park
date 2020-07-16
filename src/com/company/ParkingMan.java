package com.company;

public class ParkingMan extends ParkingPerson {
    public ParkingMan(ParkLot... parkLots) {
        super(parkLots);
    }
    // TODO 是否可以通过构造函数传入strategy?
    Strategy parkingWay;
    public void setParkingStrategy(Strategy strategy) {
        this.parkingWay = strategy;
    }

    public String park(Car car) {
        int maxNumberOfVacancy = super.getParkLotList().get(0).getNumberOfVacancy();
        double maxNumberOfPrecentage = super.getParkLotList().get(0).getPrecentageOfVacancy();;
        int maxNumberOfVacancyParkLotIndex = 0;
        int maxNumberOfPrecentageParkLotIndex = 0;
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
        if (this.parkingWay == Strategy.NUMBER) {
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
