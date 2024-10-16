package parkinglot.model;

import parkinglot.parkingmanager.ParkingSpotManager;
import parkinglot.parkingmanager.ParkingSpotManagerFactory;
import parkinglot.VehicleType;

public class EntranceGate {
	ParkingSpotManagerFactory parkingSpotManagerFactory;
	
	public EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
		this.parkingSpotManagerFactory = parkingSpotManagerFactory;
	}
	
	public Ticket generateTicket(VehicleType vehicleType){
		ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicleType);
		Ticket ticket = parkingSpotManager.parkVehicle();
		return ticket;
	}
}
