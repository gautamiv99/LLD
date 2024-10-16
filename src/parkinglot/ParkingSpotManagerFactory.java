package parkinglot;
import java.util.*;

public class ParkingSpotManagerFactory {
	List<ParkingSpot> twoWheelerParkingSpots;
	List<ParkingSpot> fourWheelerParkingSpots;
	ParkingStrategy strategy;

	ParkingSpotManagerFactory(List<ParkingSpot> twoWheelerParkingSpots, List<ParkingSpot> fourWheelerParkingSpots, ParkingStrategy strategy){
		this.twoWheelerParkingSpots = twoWheelerParkingSpots;
		this.fourWheelerParkingSpots = fourWheelerParkingSpots;
		this.strategy = strategy;
	}

	ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) {
		switch(vehicleType){
			case TWO_WHEELER: return new TwoWheelerParkingSpotManager(twoWheelerParkingSpots, strategy);
			case FOUR_WHEELER: return new FourWheelerParkingSpotManager(fourWheelerParkingSpots, strategy);
			default: return null;
		}
	}
}
