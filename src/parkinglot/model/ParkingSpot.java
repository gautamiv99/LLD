package parkinglot.model;

import parkinglot.VehicleType;

public class ParkingSpot {
	private long id;
	
	private boolean isEmpty;
	
	private VehicleType vehicleType;

	private int distance;

	public ParkingSpot(long id, VehicleType vehicleType, int distance) {
		this.id = id;
		this.isEmpty = true;
		this.vehicleType = vehicleType;
		this.distance = distance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	
	public VehicleType getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getDistance(){
		return this.distance;
	}

	public void setDistance(int distance){
		this.distance = distance;
	}

	public void parkVehicle() {
		this.isEmpty = false;
	}
	
	public void removeVehicle() {
		this.isEmpty = true;
	}
}
