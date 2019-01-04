package qaf.example.beans;

import com.qmetry.qaf.automation.data.BaseDataBean;

public class FlightFinder extends BaseDataBean{
	
    private String tripType;
	
    private String passengers;
	
    private String depFrom;
	
    private String onMonth;
	
    private String onDate;
	
    private String arrival;
	
    private String retMonth;
    
	private String retDate;
	
    private String flightClass;
	
    private String airlinedep;
    private String airlineret;
    

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public String getPassengers() {
		return passengers;
	}

	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}

	public String getDepFrom() {
		return depFrom;
	}

	public void setDepFrom(String depFrom) {
		this.depFrom = depFrom;
	}

	public String getOnMonth() {
		return onMonth;
	}

	public void setOnMonth(String onMonth) {
		this.onMonth = onMonth;
	}

	public String getOnDate() {
		return onDate;
	}

	public void setOnDate(String onDate) {
		this.onDate = onDate;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getRetMonth() {
		return retMonth;
	}

	public void setRetMonth(String retMonth) {
		this.retMonth = retMonth;
	}

	public String getRetDate() {
		return retDate;
	}

	public void setRetDate(String retDate) {
		this.retDate = retDate;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}



	public String getAirlinedep() {
		return airlinedep;
	}

	public void setAirlinedep(String airlinedep) {
		this.airlinedep = airlinedep;
	}

	public String getAirlineret() {
		return airlineret;
	}

	public void setAirlineret(String airlineret) {
		this.airlineret = airlineret;
	}
	}
