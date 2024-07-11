package com.naresh.core.autowiring;

public class Train {
	
	private String trainName;
	private String trainNumber;
	private String startsAt;
	private String endsAt;
	
	public Train(String trainName, String trainNumber, String startsAt, String endsAt) {
		super();
		this.trainName = trainName;
		this.trainNumber = trainNumber;
		this.startsAt = startsAt;
		this.endsAt = endsAt;
	}
	
	public Train() {
		super();
	}

	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getStartsAt() {
		return startsAt;
	}
	public void setStartsAt(String startsAt) {
		this.startsAt = startsAt;
	}
	public String getEndsAt() {
		return endsAt;
	}
	public void setEndsAt(String endsAt) {
		this.endsAt = endsAt;
	}

	@Override
	public String toString() {
		return "Train [trainName=" + trainName + ", trainNumber=" + trainNumber + ", startsAt=" + startsAt + ", endsAt="
				+ endsAt + "]";
	}
	
	

}
