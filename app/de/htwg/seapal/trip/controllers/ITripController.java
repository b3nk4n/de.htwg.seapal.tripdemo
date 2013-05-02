package de.htwg.seapal.trip.controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import de.htwg.seapal.common.observer.IObservable;
import de.htwg.seapal.trip.models.ITrip;

public interface ITripController extends IObservable{
	
	Map<Integer, String> getTripList();
	List<ITrip> getTrips();
	void createTrip(ITrip trip);
	
	String getName(long id);
	void setName(long id, String name);
	
	String getStartLocation(long id);
	void setStartLocation(long id, String location);
	
	String getEndLocation(long id);
	void setEndLocation(long id, String location);
	
	String getSkipper(long id);
	void setSkipper(long id, String skipper);
	
	List<String> getCrewMembers(long id);
	void addCrewMembers(long id, List<String> crewMembers);
	
	Date getStartTime(long id);
	void setStartTime(long id, Date start);
	
	Date getEndTime(long id);
	void setEndTime(long id, Date end);
	
	long getDuration(long id);
	void setDuration(long id, long timeInSeconds);
	
	int getMotor(long id);
	void setMotor(long id, int motor);

	double getFuel(long id);
	void setFuel(long id, double percent);
	
	String getNotes(long id);
	void setNotes(long id, String text);
}