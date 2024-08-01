package parkinglot;

import java.util.ArrayList;

public class ExitGate {
	ParkingSpotManagerFactory parkingSpotManagerFactory;
	
	ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
		this.parkingSpotManagerFactory = parkingSpotManagerFactory;
	}
	
	void removeVehicle(Ticket ticket) {
		Vehicle vehicle = ticket.getVehicle();
		ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(new ArrayList<>(), vehicle);
		parkingSpotManager.removeVehicle(vehicle);
	}
}
