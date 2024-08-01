package parkinglot;

import java.util.*;
import java.util.stream.Collectors;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {
	
	TwoWheelerParkingSpotManager(List<ParkingSpot> spots){
		super(spots);
	}
	
	@Override
	List<ParkingSpot> findAvailableParkingSpots(){
		return parkingSpots.stream().filter(spot -> (spot.isEmpty())).collect(Collectors.toList());
	}
	
	@Override
	ParkingSpot findParkingSpot() {
		//implementation
		return null;
	}

}
