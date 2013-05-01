package de.htwg.seapal.trip.controllers.mock;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.trip.controllers.ITripController;
import de.htwg.seapal.trip.database.ITripDatabase;
import de.htwg.seapal.trip.models.ITrip;
import de.htwg.seapal.common.*;
import de.htwg.seapal.common.observer.Observable;

@Singleton
public class TripController extends Observable implements ITripController{
	
  @Override
  public Map<Integer, String> getTripList() {
    Map<Integer, String> trips = new HashMap<Integer, String>();
    trips.put(001, "Caribbean Cruise");
    return trips;
  }
  
	@Override
	public String getName(long id) 
	{
		return "Caribbean Cruise";
	}

	@Override
	public void setName(long id, String name) {
	}

	@Override
	public void setStartLocation(long id, String location) {
	}

	@Override
	public String getStartLocation(long id) {
    return "Konstanz";
	}

	@Override
	public void setEndLocation(long id, String location) {
	}

	@Override
	public String getEndLocation(long id) {
    return "Port Royal";
	}

	@Override
	public void setSkipper(long id, String skipper) {
	}

	@Override
	public String getSkipper(long id) {
    return "John Smith";
	}

	@Override
	public void addCrewMembers(long id, List<String> crewMembers) {
	}

	@Override
	public List<String> getCrewMembers(long id) {
      List<String> crew = new ArrayList<String>();
      crew.add("Jack");
      crew.add("John");
			return crew;
	}

	@Override
	public void setStartTime(long id, Date start) {
	}

	@Override
	public Date getStartTime(long id) {
		return new Date();
	}

	@Override
	public void setEndTime(long id, Date end) {
	}

	@Override
	public Date getEndTime(long id) {
    return new Date();
	}

	@Override
	public void setDuration(long id, long timeInSeconds) {
	}

	@Override
	public long getDuration(long id) {
    return 20;
	}

	@Override
	public void setMotor(long id, int motor) {
	}

	@Override
	public int getMotor(long id) {
     return 30;
  }

	@Override
	public void setFuel(long id, double percent) {
	}

	@Override
	public double getFuel(long id) {
    return 43;
	}

	@Override
	public void setNotes(long id, String text) {
	}

	@Override
	public String getNotes(long id) {
    return "Nice Trip. Enjoy!";
	}
}