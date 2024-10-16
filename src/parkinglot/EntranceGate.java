package parkinglot;

import java.util.*;

public class EntranceGate {
	ParkingSpotManagerFactory parkingSpotManagerFactory;
	
	EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
		this.parkingSpotManagerFactory = parkingSpotManagerFactory;
	}
	
	Ticket generateTicket(VehicleType vehicleType){
		ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicleType);
		Ticket ticket = parkingSpotManager.parkVehicle();
		return ticket;
	}
}
