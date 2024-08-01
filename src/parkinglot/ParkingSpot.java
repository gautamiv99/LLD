package parkinglot;

public class ParkingSpot {
	private long id;
	
	private boolean isEmpty;
	
	private Vehicle vehicle;
	
	private long price;
	
	private VehicleType vehicleType;

	public ParkingSpot(long id, long price, VehicleType vehicleType) {
		super();
		this.id = id;
		this.isEmpty = true;
		this.vehicle = null;
		this.price = price;
		this.vehicleType = vehicleType;
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

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	public VehicleType getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	void parkVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		this.isEmpty = false;
	}
	
	void removeVehicle(Vehicle vehicle) {
		this.vehicle = null;
		this.isEmpty = true;
	}
	
}
