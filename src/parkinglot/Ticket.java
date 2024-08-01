package parkinglot;

public class Ticket {
	private int ticketNo;
	
	private long entryTime;
	
	private ParkingSpot parkingSpot;
	
	private Vehicle vehicle;

	public Ticket(int ticketNo, long entryTime, ParkingSpot parkingSpot, Vehicle vehicle) {
		super();
		this.ticketNo = ticketNo;
		this.entryTime = entryTime;
		this.parkingSpot = parkingSpot;
		this.vehicle = vehicle;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public long getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(long entryTime) {
		this.entryTime = entryTime;
	}

	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}

	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
