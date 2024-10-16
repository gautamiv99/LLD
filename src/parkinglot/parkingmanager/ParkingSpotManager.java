package parkinglot.parkingmanager;

import parkinglot.model.ParkingSpot;
import parkinglot.model.Ticket;

import java.util.*;

public abstract class ParkingSpotManager {
	List<ParkingSpot> parkingSpots;

	ParkingSpotManager(List<ParkingSpot> parkingSpots) {
		this.parkingSpots = parkingSpots;
	}
	
	abstract List<ParkingSpot> findAvailableParkingSpots();

	abstract ParkingSpot findParkingSpot();

	public Ticket parkVehicle() {
		ParkingSpot spot = findParkingSpot();
		spot.parkVehicle();
		return new Ticket(spot);
	}

	public void removeVehicle(Ticket ticket) {
		ticket.getParkingSpot().removeVehicle();
	}
}