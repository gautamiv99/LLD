package parkinglot;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class NearElevatorSrategy implements ParkingStrategy{
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) {
        PriorityQueue<ParkingSpot> pq = new PriorityQueue<>(Comparator.comparingInt(ParkingSpot::getDistance));
        pq.addAll(parkingSpotList);
        return pq.peek();
    }
}
