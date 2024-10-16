package parkinglot.parkingstrategy;

import parkinglot.model.ParkingSpot;

import java.util.List;

public class DefaultStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) {
        return parkingSpotList.get(0);
    }
}
