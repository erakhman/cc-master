package campingceria.master.entity;

public class Destination {
	
	private Long pkDestination;
	private String destinationName;
	private String destinationAddress;
	
	public Long getPkDestination() {
		return pkDestination;
	}
	public void setPkDestination(Long pkDestination) {
		this.pkDestination = pkDestination;
	}
	public String getDestinationName() {
		return destinationName;
	}
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	public String getDestinationAddress() {
		return destinationAddress;
	}
	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

}
