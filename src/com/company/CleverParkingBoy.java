package com.company;

public class CleverParkingBoy extends ParkingPerson {
    public CleverParkingBoy(ParkLot... parkLots) {
        super(parkLots);
    }

    public String park(Car car) {
        int maxNumberOfVacancy = super.getParkLotList().get(0).getNumberOfVacancy();
        int maxNumberOfVacancyParkLotIndex = 0;
        for(int i = 1; i < super.getParkLotList().size(); i++) {
            ParkLot currentParkLot = super.getParkLotList().get(i);
            if (currentParkLot.getNumberOfVacancy() > maxNumberOfVacancy) {
                maxNumberOfVacancy = currentParkLot.getNumberOfVacancy();
                maxNumberOfVacancyParkLotIndex = i;
            }

        }
        int parkLotIndex = maxNumberOfVacancyParkLotIndex;
        int carIndex = super.getParkLotList().get(parkLotIndex).park(car);
        return parkLotIndex + "-" + carIndex;
    }
}
