package assessment.p.com;

public class Flight {
	public String id;
	public String source;
	public  String destination;
	public double fare;
	public int totalSeats;
	public int availableSeats;
	public String arrivalTime;
	public String departureTime;
	public String companyName;
	public Flight() {}
	public Flight(String id, String source, String destination, double fare, int totalSeats, int availableSeats,
			String arrivalTime, String departureTime, String companyName) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.companyName = companyName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Flight) 
    	{
    		Flight e=(Flight) obj;
    		return id==e.id && source==e.source && destination.equals(e.destination) &&
    				fare==e.fare && totalSeats==e.totalSeats  && availableSeats==e.availableSeats
    				&& arrivalTime.equals(e.arrivalTime) &&  departureTime.equals(e.departureTime) &&
    				companyName.equals(e.companyName);
    	}
    	return false;
	}

}
