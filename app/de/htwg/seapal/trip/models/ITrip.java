package de.htwg.seapal.trip.models;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ITrip {
	
	Map<Long, String> getTripList();
	
	String getName();
	void setName( String name);
	
	String getStartLocation();
	void setStartLocation( String location);
	
	String getEndLocation();
	void setEndLocation( String location);
	
	String getSkipper();
	void setSkipper( String skipper);
	
	List<String> getCrewMembers();
	void addCrewMembers( List<String> crewMembers);
	
	Date getStartTime();
	void setStartTime( Date start);
	
	Date getEndTime();
	void setEndTime( Date end);
	
	long getDuration();
	void setDuration( long timeInSeconds);
	
	int getMotor();
	void setMotor( int motor);

	double getFuel();
	void setFuel( double percent);
	
	String getNotes();
	void setNotes( String text);

	long getId();
}