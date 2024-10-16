package parkinglot;
import parkinglot.model.EntranceGate;
import parkinglot.model.ExitGate;
import parkinglot.model.ParkingSpot;
import parkinglot.model.Ticket;
import parkinglot.parkingmanager.ParkingSpotManagerFactory;
import parkinglot.parkingstrategy.NearElevatorSrategy;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<ParkingSpot> spots = new ArrayList<>();
	
	    for (int i = 1; i <= 100; ++i) {
	        if (i <= 50)
	            spots.add(new ParkingSpot(i, VehicleType.TWO_WHEELER, new Random().nextInt()));
	        else
	            spots.add(new ParkingSpot(i, VehicleType.FOUR_WHEELER, new Random().nextInt()));
	    }

		List<ParkingSpot> twoWheelerParkingSpots = spots.parallelStream().filter((spot -> spot.getVehicleType() == VehicleType.TWO_WHEELER)).collect(Collectors.toList());
		List<ParkingSpot> fourWheelerParkingSpots = spots.parallelStream().filter((spot -> spot.getVehicleType() == VehicleType.FOUR_WHEELER)).collect(Collectors.toList());

		// Create ParkingSpotManagerFactory
	    ParkingSpotManagerFactory factory = new ParkingSpotManagerFactory(twoWheelerParkingSpots, fourWheelerParkingSpots, new NearElevatorSrategy());

		// Create EntranceGate and ExitGate objects
	    EntranceGate entranceGate = new EntranceGate(factory);
	    ExitGate exitGate = new ExitGate(factory);

	    // Example usage

	    Ticket ticket1 = entranceGate.generateTicket(VehicleType.FOUR_WHEELER);
		Ticket ticket2 = entranceGate.generateTicket(VehicleType.TWO_WHEELER);
		Ticket ticket3 = entranceGate.generateTicket(VehicleType.FOUR_WHEELER);
		Ticket ticket4 = entranceGate.generateTicket(VehicleType.TWO_WHEELER);

	    exitGate.removeVehicle(ticket1);
		exitGate.removeVehicle(ticket2);
		exitGate.removeVehicle(ticket3);
		exitGate.removeVehicle(ticket4);
	}
}
