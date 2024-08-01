package parkinglot;

import java.util.List;
import java.util.stream.Collectors;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {
	
	FourWheelerParkingSpotManager(List<ParkingSpot> spots){
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
