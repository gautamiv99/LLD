package parkinglot;
import java.util.*;

public class ParkingSpotManagerFactory {
	ParkingSpotManager getParkingSpotManager(List<ParkingSpot> spots,Vehicle vehicle) {
		if(vehicle.getVehicleType() == VehicleType.TWO_WHEELER) {
			return new TwoWheelerParkingSpotManager(spots);
		} else if(vehicle.getVehicleType() == VehicleType.FOUR_WHEELER) {
			return new FourWheelerParkingSpotManager(spots);
		} else {
			return null; // error handling
		}
	}
}
