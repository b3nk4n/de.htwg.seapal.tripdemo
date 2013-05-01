package de.htwg.seapal.trip.controllers.impl;

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
import de.htwg.seapal.trip.models.impl.Trip;
import de.htwg.seapal.common.observer.Observable;

@Singleton
public class TripController extends Observable implements ITripController{
		
	@Inject
	private ITripDatabase database;
	
  @Override
  public Map<Integer, String> getTripList() {
    Map<Integer, String> trips = new HashMap<Integer, String>();
    //TODO
    return trips;
  }
  
	@Override
	public String getName(long id) 
	{
		if (database.containsTrip(id))
			return database.getTripById(id).getName();
		else
			return null;
	}

	@Override
	public void setName(long id, String name) {
		ITrip trip;
		
		if (database.containsTrip(id)) {
			trip = database.getTripById(id);
			trip.setName(name);
			database.saveTrip(trip);
		}
		
		notifyObservers();
	}

	@Override
	public void setStartLocation(long id, String location) {
		ITrip trip;
		
		if (database.containsTrip(id)) {
			trip = database.getTripById(id);
			trip.setStartLocation(location);
			database.saveTrip(trip);
		}
		
		notifyObservers();
	}

	@Override
	public String getStartLocation(long id) {
		if (database.containsTrip(id))
			return database.getTripById(id).getStartLocation();
		else
			return null;

	}

	@Override
	public void setEndLocation(long id, String location) {
		ITrip trip;
		
		if (database.containsTrip(id)) {
			trip = database.getTripById(id);
			trip.setEndLocation(location);
			database.saveTrip(trip);
		}
		
		notifyObservers();
		
	}

	@Override
	public String getEndLocation(long id) {
		if (database.containsTrip(id))
			return database.getTripById(id).getEndLocation();
		else
			return null;
	}

	@Override
	public void setSkipper(long id, String skipper) {
		ITrip trip;
		
		if (database.containsTrip(id)) {
			trip = database.getTripById(id);
			trip.setSkipper(skipper);
			database.saveTrip(trip);
		}
		
		notifyObservers();
		
	}

	@Override
	public String getSkipper(long id) {
		if (database.containsTrip(id))
			return database.getTripById(id).getSkipper(); 
		else
			return null;
	}

	@Override
	public void addCrewMembers(long id, List<String> crewMembers) {
		ITrip trip;
		
		if (database.containsTrip(id)) {
			trip = database.getTripById(id);
			trip.addCrewMembers(crewMembers);
			database.saveTrip(trip);
		}
		
		notifyObservers();
		
	}

	@Override
	public List<String> getCrewMembers(long id) {
		if (database.containsTrip(id))
			return database.getTripById(id).getCrewMembers();
		else
			return null;
	}

	@Override
	public void setStartTime(long id, Date start) {
		ITrip trip;
		
		if (database.containsTrip(id)) {
			trip = database.getTripById(id);
			trip.setStartTime(start);
			database.saveTrip(trip);
		}
		
		notifyObservers();
		
	}

	@Override
	public Date getStartTime(long id) {
		if (database.containsTrip(id))
			return database.getTripById(id).getStartTime();
		else
			return null;
	}

	@Override
	public void setEndTime(long id, Date end) {
		ITrip trip;
		
		if (database.containsTrip(id)) {
			trip = database.getTripById(id);
			trip.setEndTime(end);
			database.saveTrip(trip);
		}
		
		notifyObservers();
		
	}

	@Override
	public Date getEndTime(long id) {
		if (database.containsTrip(id))
			return database.getTripById(id).getEndTime();
		else
			return null;
	}

	@Override
	public void setDuration(long id, long timeInSeconds) {
		ITrip trip;
		
		if (database.containsTrip(id)) {
			trip = database.getTripById(id);
			trip.setDuration(timeInSeconds);
			database.saveTrip(trip);
		}
		
		notifyObservers();
		
	}

	@Override
	public long getDuration(long id) {
		if (database.containsTrip(id))
			return database.getTripById(id).getDuration();
		else
			return -1;
	}

	@Override
	public void setMotor(long id, int motor) {
		ITrip trip;
		
		if (database.containsTrip(id)) {
			trip = database.getTripById(id);
			trip.setMotor(motor); 
			database.saveTrip(trip);
		}
		
		notifyObservers();
		
	}

	@Override
	public int getMotor(long id) {
		if (database.containsTrip(id))
			return database.getTripById(id).getMotor();
		else
			return -1;
	}

	@Override
	public void setFuel(long id, double percent) {
		ITrip trip;

		if (database.containsTrip(id)) {
			trip = database.getTripById(id);
			trip.setFuel(percent);
			database.saveTrip(trip);
		}
		
		notifyObservers();
		
	}

	@Override
	public double getFuel(long id) {
		if (database.containsTrip(id))
			return database.getTripById(id).getFuel();
		else
			return -1;
	}

	@Override
	public void setNotes(long id, String text) {
		ITrip trip;
		
		if (database.containsTrip(id)) {
			trip = database.getTripById(id);
			trip.setNotes(text);
			database.saveTrip(trip);
		}
		
		notifyObservers();
		
	}

	@Override
	public String getNotes(long id) {
		if (database.containsTrip(id))
			return database.getTripById(id).getNotes();
		else
			return null;
	}

	@Override
	public List<ITrip> getTrips() {
		List<ITrip> trips = new ArrayList<ITrip>();
		
		ITrip t1 = new Trip();
		t1.setName("Caribbean Cruise");
		t1.setDuration(2313123);
		t1.setEndLocation("KN");
		t1.setStartLocation("FN");
		t1.setMotor(1231);
		t1.setSkipper("Skipperidoo");
		t1.setStartTime(new Date());
		t1.setNotes("Notes...");
		trips.add(t1);
		
		ITrip t2 = new Trip();
		t2.setName("Mittelmeer Rundfahrt");
		t2.setDuration(1213);
		t2.setEndLocation("Malle");
		t2.setStartLocation("Ibiza");
		t2.setMotor(1231);
		t2.setSkipper("Skippy");
		t2.setStartTime(new Date());
		t2.setNotes("Bla blaaa...");
		trips.add(t2);
		
		ITrip t3 = new Trip();
		t3.setName("Titanic Cruise");
		t3.setDuration(1912);
		t3.setEndLocation("England");
		t3.setStartLocation("USA");
		t3.setMotor(99999);
		t3.setSkipper("Captain Hook");
		t3.setStartTime(new Date());
		t3.setNotes("Alle gehen drauf!");
		trips.add(t3);
		
		return trips;
	}
}