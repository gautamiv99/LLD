package parkinglot.parkingstrategy;

import parkinglot.model.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList);
}
