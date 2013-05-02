package de.htwg.seapal.trip.database;

import java.util.List;

import de.htwg.seapal.trip.models.ITrip;

public interface ITripDatabase {
	
	long newTrip();
	
	void saveTrip(ITrip trip);
	
	boolean containsTrip(long  tripId);
	
	ITrip getTripById(long  tripId);
	
	List<ITrip> getAllTrips();
	
	void deleteTripById(long  tripId);
}
