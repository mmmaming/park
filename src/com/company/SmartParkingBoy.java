package com.company;

public class SmartParkingBoy extends ParkingPerson{
    public SmartParkingBoy(ParkLot... parkLots) {
        super(parkLots);
    }

    public String park(Car car) {
        double maxNumberOfPrecentage = super.getParkLotList().get(0).getPrecentageOfVacancy();;
        int maxNumberOfPrecentageParkLotIndex = 0;
        for(int i = 0; i < super.getParkLotList().size(); i++) {
            ParkLot currentParkLot = super.getParkLotList().get(i);
            if (currentParkLot.getPrecentageOfVacancy() > maxNumberOfPrecentage) {
                maxNumberOfPrecentage = currentParkLot.getPrecentageOfVacancy();
                maxNumberOfPrecentageParkLotIndex = i;
            }
        }
        int parkLotIndex = maxNumberOfPrecentageParkLotIndex;
        int carIndex = super.getParkLotList().get(parkLotIndex).park(car);
        return parkLotIndex + "-" + carIndex;
    }
}
