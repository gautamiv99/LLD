package parkinglot;

public class ExitGate {
	ParkingSpotManagerFactory parkingSpotManagerFactory;
	
	ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
		this.parkingSpotManagerFactory = parkingSpotManagerFactory;
	}
	
	void removeVehicle(Ticket ticket) {
		ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(ticket.getParkingSpot().getVehicleType());
		parkingSpotManager.removeVehicle(ticket);
	}
}