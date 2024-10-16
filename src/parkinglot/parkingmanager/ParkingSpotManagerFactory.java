package parkinglot.parkingmanager;
import parkinglot.VehicleType;
import parkinglot.model.ParkingSpot;
import parkinglot.parkingstrategy.ParkingStrategy;

import java.util.*;

public class ParkingSpotManagerFactory {
	List<ParkingSpot> twoWheelerParkingSpots;
	List<ParkingSpot> fourWheelerParkingSpots;
	ParkingStrategy strategy;

	public ParkingSpotManagerFactory(List<ParkingSpot> twoWheelerParkingSpots, List<ParkingSpot> fourWheelerParkingSpots, ParkingStrategy strategy){
		this.twoWheelerParkingSpots = twoWheelerParkingSpots;
		this.fourWheelerParkingSpots = fourWheelerParkingSpots;
		this.strategy = strategy;
	}

	public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) {
		switch(vehicleType){
			case TWO_WHEELER: return new TwoWheelerParkingSpotManager(twoWheelerParkingSpots, strategy);
			case FOUR_WHEELER: return new FourWheelerParkingSpotManager(fourWheelerParkingSpots, strategy);
			default: return null;
		}
	}
}
