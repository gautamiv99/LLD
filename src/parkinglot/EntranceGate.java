package parkinglot;

import java.util.*;

public class EntranceGate {
	ParkingSpotManagerFactory parkingSpotManagerFactory;
	
	EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
		this.parkingSpotManagerFactory = parkingSpotManagerFactory;
	}
	
	ParkingSpot findParkingSpot(List<ParkingSpot> spots, Vehicle vehicle){
		ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(spots, vehicle);
		return parkingSpotManager.findParkingSpot();
	}
	
	void updateParkingSpot(ParkingSpot spot){
		spot.setEmpty(false);
	}
	
	Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
		//implementaion to generate ticket
		return null;
	}
}
