package parkinglot;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class DefaultStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) {
        return parkingSpotList.get(0);
    }
}
