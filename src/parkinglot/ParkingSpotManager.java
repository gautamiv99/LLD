package parkinglot;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public abstract class ParkingSpotManager {
	List<ParkingSpot> parkingSpots;

	ParkingSpotManager(List<ParkingSpot> parkingSpots) {
		this.parkingSpots = parkingSpots;
	}
	
	abstract List<ParkingSpot> findAvailableParkingSpots();

	abstract ParkingSpot findParkingSpot();

	void parkVehicle(Vehicle vehicle) {
		ParkingSpot spot = findParkingSpot();
		spot.parkVehicle(vehicle);
	}

	void removeVehicle(Vehicle vehicle) {
		for (ParkingSpot spot : parkingSpots) {
			if (spot.getVehicle() != null && spot.getVehicle().equals(vehicle)) {
				spot.removeVehicle(vehicle);
				break;
			}
		}
	}
}
