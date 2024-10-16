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

	Ticket parkVehicle() {
		ParkingSpot spot = findParkingSpot();
		spot.parkVehicle();
		return new Ticket(spot);
	}

	void removeVehicle(Ticket ticket) {
		ticket.getParkingSpot().removeVehicle();
	}
}