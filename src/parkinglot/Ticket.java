package parkinglot;

public class Ticket {
	private int ticketId;
	
	private long entryTime;
	
	private ParkingSpot parkingSpot;

	public Ticket(ParkingSpot parkingSpot) {
		super();
		this.ticketId = Constants.counter++;
		this.entryTime = System.currentTimeMillis();
		this.parkingSpot = parkingSpot;
	}

	public long getTicketId(){
		return ticketId;
	}

	public void setTicketId(){
		this.ticketId = Constants.counter++;
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
	
}