package de.htwg.seapal.trip.database.impl;

import java.util.HashMap;
import java.util.Map;

import de.htwg.seapal.trip.database.ITripDatabase;
import de.htwg.seapal.trip.models.ITrip;
import de.htwg.seapal.trip.models.impl.Trip;

public class TripHashMapDatabase implements ITripDatabase {

	private Map<Long, ITrip> database = new HashMap<Long, ITrip>();
	
	@Override
	public long newTrip() {
		ITrip trip = new Trip(System.currentTimeMillis());
		long tId = trip.getId();
		database.put(tId, trip);
		return tId;
	}
	
	@Override
	public ITrip getTripById(long tripId) {
		return database.get(tripId);
	}

	@Override
	public void saveTrip(ITrip trip) {
		database.put(trip.getId(), trip);
	}

	@Override
	public void deleteTripById(long tripId) {
		database.remove(tripId);
	}

	@Override
	public boolean containsTrip(long tripId) {
		return database.containsKey(tripId);
	}

}