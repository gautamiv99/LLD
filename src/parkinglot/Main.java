package parkinglot;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<ParkingSpot> spots = new ArrayList<>();
	
	    for (int i = 1; i <= 100; ++i) {
	
	        if (i <= 50)
	
	            spots.add(new ParkingSpot(i, 10, VehicleType.TWO_WHEELER));
	
	        else
	
	            spots.add(new ParkingSpot(i, 20, VehicleType.FOUR_WHEELER));
	
	    }
	
	
	
	    // Create ParkingSpotManagerFactory
	
	    ParkingSpotManagerFactory factory = new ParkingSpotManagerFactory();
	
	
	
	    // Create EntranceGate and ExitGate objects
	
	    EntranceGate entranceGate = new EntranceGate(factory);
	
	    ExitGate exitGate = new ExitGate(factory);
	
	
	
	    // Example usage
	
	    Vehicle vehicle = new Vehicle("123", VehicleType.TWO_WHEELER);
	
	    ParkingSpot spot = entranceGate.findParkingSpot(spots, vehicle);
	
	    Ticket ticket = entranceGate.generateTicket(vehicle, spot);
	
	
	
	    // Vehicle leaves
	
	    exitGate.removeVehicle(ticket);
	}
}
