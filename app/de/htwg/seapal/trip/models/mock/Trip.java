package de.htwg.seapal.trip.models.mock;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.htwg.seapal.trip.models.AbstractTrip;

public class Trip extends AbstractTrip{

  @Override
  public Map<Long, String> getTripList() {
    Map<Long, String> trips = new HashMap<Long, String>();
    trips.put(System.currentTimeMillis(), "Caribbean Cruise");
    return trips;
  }
  
	@Override
	public String getName() 
	{
		return "Caribbean Cruise";
	}

	@Override
	public void setName( String name) {
	}

	@Override
	public void setStartLocation( String location) {
	}

	@Override
	public String getStartLocation() {
    return "Konstanz";
	}

	@Override
	public void setEndLocation( String location) {
	}

	@Override
	public String getEndLocation() {
    return "Port Royal";
	}

	@Override
	public void setSkipper( String skipper) {
	}

	@Override
	public String getSkipper() {
    return "John Smith";
	}

	@Override
	public void addCrewMembers( List<String> crewMembers) {
	}

	@Override
	public List<String> getCrewMembers() {
      List<String> crew = new ArrayList<String>();
      crew.add("Jack");
      crew.add("John");
			return crew;
	}

	@Override
	public void setStartTime( Date start) {
	}

	@Override
	public Date getStartTime() {
		return new Date();
	}

	@Override
	public void setEndTime( Date end) {
	}

	@Override
	public Date getEndTime() {
    return new Date();
	}

	@Override
	public void setDuration( long timeInSeconds) {
	}

	@Override
	public long getDuration() {
    return 20;
	}

	@Override
	public void setMotor( int motor) {
	}

	@Override
	public int getMotor() {
     return 30;
  }

	@Override
	public void setFuel( double percent) {
	}

	@Override
	public double getFuel() {
    return 43;
	}

	@Override
	public void setNotes( String text) {
	}

	@Override
	public String getNotes() {
    return "Nice Trip. Enjoy!";
	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}
}