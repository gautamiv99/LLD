package parkinglot.model;

import parkinglot.parkingmanager.ParkingSpotManager;
import parkinglot.parkingmanager.ParkingSpotManagerFactory;

public class ExitGate {
	ParkingSpotManagerFactory parkingSpotManagerFactory;
	
	public ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
		this.parkingSpotManagerFactory = parkingSpotManagerFactory;
	}
	
	public void removeVehicle(Ticket ticket) {
		ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(ticket.getParkingSpot().getVehicleType());
		parkingSpotManager.removeVehicle(ticket);
	}
}