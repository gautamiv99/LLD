package parkinglot;

import java.util.*;
import java.util.stream.Collectors;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {
	ParkingStrategy strategy;

	TwoWheelerParkingSpotManager(List<ParkingSpot> spots, ParkingStrategy strategy){
		super(spots);
		this.strategy = strategy;
	}
	
	@Override
	List<ParkingSpot> findAvailableParkingSpots(){
		return parkingSpots.stream().filter(spot -> (spot.isEmpty())).collect(Collectors.toList());
	}
	
	@Override
	ParkingSpot findParkingSpot() {
		List<ParkingSpot> availableParkingSpots = findAvailableParkingSpots();
		strategy.findParkingSpot(availableParkingSpots);
		return null;
	}

}
